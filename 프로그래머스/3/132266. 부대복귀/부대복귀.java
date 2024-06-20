import java.util.*;
import java.io.*;

class Solution {
    static class Edge implements Comparable<Edge> {
        int end, time;
        
        public Edge (int end, int time) {
            this.end = end;
            this.time = time;
        }
        
        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.time, o.time);
        }
    }
    
    static ArrayList<Edge>[] adjList;
    
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        adjList = new ArrayList[n+1];
        for(int i = 1; i <= n; i++)
            adjList[i] = new ArrayList<Edge>();
        
        for(int i = 0; i < roads.length; i++) {
            adjList[roads[i][0]].add(new Edge(roads[i][1], 1));
            adjList[roads[i][1]].add(new Edge(roads[i][0], 1));
        }
        
        return dijkstra(n, sources, destination);
    }
    
    public static int[] dijkstra(int n, int[] sources, int destination) {
        PriorityQueue<Edge> pqueue = new PriorityQueue<Edge>();
        pqueue.add(new Edge(destination, 0));
        int[] time = new int[n+1];
        Arrays.fill(time, Integer.MAX_VALUE);
        time[destination] = 0;
        boolean[] visited = new boolean[n+1];
        Edge edge;
        while(!pqueue.isEmpty()) {
            edge = pqueue.poll();
            if(visited[edge.end])
                continue;
            visited[edge.end] = true;
            for(Edge e : adjList[edge.end]) {
                if(time[e.end] > time[edge.end] + e.time) {
                    time[e.end] = time[edge.end] + e.time;
                    pqueue.add(new Edge(e.end, time[e.end]));
                }
            }
        }
        
        int[] ans = new int[sources.length];
        for(int i = 0; i < sources.length; i++)
            ans[i] = time[sources[i]] == Integer.MAX_VALUE ? -1 : time[sources[i]];
        
        return ans;
    }
}