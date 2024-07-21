import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			pq.add(Integer.parseInt(st.nextToken()));
		for (int i = 1; i <= N; i++)
			ans = Math.max(ans, pq.poll() + i);
		System.out.println(ans + 1);
	}
}