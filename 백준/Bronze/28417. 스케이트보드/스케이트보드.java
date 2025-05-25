import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), score, ans = 0;
		StringTokenizer st;
		PriorityQueue<Integer> pq;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			score = 0;
			pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			for (int i = 0; i < 2; i++)
				score = Math.max(score, Integer.parseInt(st.nextToken()));
			for (int i = 0; i < 5; i++)
				pq.add(Integer.parseInt(st.nextToken()));
			score += pq.poll() + pq.poll();
			ans = Math.max(ans, score);
		}
		System.out.println(ans);
	}
}