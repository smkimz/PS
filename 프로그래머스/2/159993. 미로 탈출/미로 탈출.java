import java.util.*;

class Solution {
    static class Point {
        int row, col, time;
        
        public Point (int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    
    static int R, C;
    static char[][] map;
    static int[][] start, end;
    
    public int solution(String[] maps) {
        R = maps.length;
        C = maps[0].length();
        map = new char[R][C];
        start = new int[2][2];
        end = new int[2][2];
        for(int i = 0; i < R; i++) {
            map[i] = maps[i].toCharArray();
            for(int j = 0; j < C; j++) {
                if(map[i][j] == 'O' || map[i][j] == 'X')
                    continue;
                if(map[i][j] == 'S') {
                    start[0][0] = i;
                    start[0][1] = j;
                    
                }
                else if(map[i][j] == 'L') {
                    start[1][0] = i;
                    start[1][1] = j;
                    end[0][0] = i;
                    end[0][1] = j;
                }
                else if(map[i][j] == 'E') {
                    end[1][0] = i;
                    end[1][1] = j;
                }
                map[i][j] = 'O';
            }
        }
        
        int toLever = bfs(0);
        if(toLever == -1)
            return -1;
        int toExit = bfs(1);
        if(toExit == -1)
            return -1;
        return toLever + toExit;
    }
    
    public static int bfs(int idx) {
        Deque<Point> dq = new ArrayDeque<Point>();
        dq.add(new Point(start[idx][0], start[idx][1], 0));
        boolean[][] visited = new boolean[R][C];
        visited[start[idx][0]][start[idx][1]] = true;
        Point point;
        int dr, dc;
        int[][] dt = {{0, 1, 0, -1}, {1, 0, -1, 0}};
        while(!dq.isEmpty()) {
            point = dq.poll();
            if(point.row == end[idx][0] && point.col == end[idx][1])
                return point.time;
            
            for(int i = 0; i <= 3; i++) {
                dr = point.row + dt[0][i];
                dc = point.col + dt[1][i];
                if(dr >= 0 && dr <= R-1 && dc >= 0 && dc <= C-1 && !visited[dr][dc] && map[dr][dc] != 'X') {
                    visited[dr][dc] = true;
                    dq.add(new Point(dr, dc, point.time + 1));
                }
            }
            
        }
        return -1;
    }
}