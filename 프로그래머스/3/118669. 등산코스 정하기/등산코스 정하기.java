import java.util.*;

class Solution {
    static class Path implements Comparable<Path> {
        int start, end, time;
        
        public Path (int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
        
        @Override
        public int compareTo(Path o) {
            return Integer.compare(this.time, o.time);
        }
    }
    
    static int[] parent, ans;
    static PriorityQueue<Path> pqueue;
    static boolean[] start, end;
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        pqueue = new PriorityQueue<Path>();
        for(int i = 0; i < paths.length; i++)
            pqueue.add(new Path(paths[i][0], paths[i][1], paths[i][2]));
        
        parent = new int[n+1];
        for(int i = 1; i <= n; i++)
            parent[i] = i;
        
        start = new boolean[n+1];
        for(int i = 0; i < gates.length; i++)
            start[gates[i]] = true;
        
        end = new boolean[n+1];
        for(int i = 0; i < summits.length; i++)
            end[summits[i]] = true;
        
        ans = new int[2];
        for(int i = 0; i <= 1; i++)
            ans[i] = Integer.MAX_VALUE;
        
        findRoute();
        return ans;
    }
    
    public static void findRoute() {
        int px, py;
        Path path;
        while(!pqueue.isEmpty()) {
            path = pqueue.poll();
            if(path.time > ans[1])
                return;
            px = findset(path.start);
            py = findset(path.end);
            if(px != py)
                union(px, py, path);  
        }
    }
    
    public static int findset(int x) {
        if(parent[x] != x)
            parent[x] = findset(parent[x]);
        return parent[x];
    }
    
    public static void union(int x, int y, Path path) {
        if((start[x] && start[y]) || (end[x] && end[y]))
            return;
        else if(start[x] && end[y]) {
            if(y < ans[0]) {
                ans[0] = y;
                ans[1] = path.time;
            }
            return;
        } else if (start[y] && end[x]) {
            if(x < ans[0]) {
                ans[0] = x;
                ans[1] = path.time;
            }
            return;
        }
        else if(start[x] || end[x]) {
            parent[y] = x;
            return;
        }
        else if(start[y] || end[y]) {
            parent[x] = y;
            return;
        }
        parent[Math.max(x, y)] = Math.min(x, y);
    }
}