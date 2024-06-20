import java.util.*;
class Solution {
    static int N, M, R, C, K;
    static int[][] dt = {{1, 0, 0, -1}, {0, -1, 1, 0}};
    static char[] str, dir = {'d', 'l', 'r', 'u'};
    static String ans = "";
    static boolean solved = false;
    
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        N = n;
        M = m;
        R = r-1;
        C = c-1;
        K = k;
        
        if((K - distanceToExit(x-1, y-1)) % 2 == 1 || K - distanceToExit(x-1, y-1) < 0)
            return "impossible";
        
        str = new char[k];
        dfs(x-1, y-1, 0);
        return ans;
    }
    
    public static void dfs(int row, int col, int move) {
        if(solved || distanceToExit(row, col) + move > K)
            return;
        
        if(row == R && col == C && move == K) {
            for(int i = 0; i < K; i++)
                ans = String.valueOf(str);
            solved = true;
        }
        
        if(move == K)
            return;
            
        int dr, dc;
        for(int i = 0; i <= 3; i++) {
            dr = row + dt[0][i];
            dc = col + dt[1][i];
            if(isMovable(dr, dc)) {
                str[move] = dir[i];
                dfs(dr, dc, move + 1);
            }
        }
    }
    
    public static boolean isMovable(int row, int col) {
        return row >= 0 && row <= N-1 && col >= 0 && col <= M-1;
    }
    
    public static int distanceToExit(int row, int col) {
        return Math.abs(R - row) + Math.abs(C - col);
    }
}