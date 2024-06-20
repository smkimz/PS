import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        int soldier, ans = 0;
        for(int i = 0; i < enemy.length; i++) {
            if(k > 0) {
                pqueue.add(enemy[i]);
                ans++;
                k--;
                continue;
            }
            
            if(enemy[i] > pqueue.peek()) {
                n -= pqueue.poll();
                pqueue.add(enemy[i]);
            } 
            else
                n -= enemy[i];
                
            if(n < 0)
                return ans;
            ans++;
        }
        return enemy.length;
    }
}