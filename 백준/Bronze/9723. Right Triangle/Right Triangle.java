import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 1; i <= T; i++) {
			sb.append("Case #").append(i).append(": ");
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++)
				pq.add(Integer.parseInt(st.nextToken()));
			if (Math.pow(pq.poll(), 2) + Math.pow(pq.poll(), 2) == Math.pow(pq.poll(), 2))
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		System.out.print(sb);
	}
}