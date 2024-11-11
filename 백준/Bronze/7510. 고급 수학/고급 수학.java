import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		double X;
		PriorityQueue<Double> pqueue = new PriorityQueue<>();
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++)
				pqueue.add(Double.parseDouble(st.nextToken()));
			X = Math.pow(pqueue.poll(), 2) + Math.pow(pqueue.poll(), 2);
			sb.append("Scenario #").append(t).append(":\n");
			if (X == Math.pow(pqueue.poll(), 2))
				sb.append("yes\n\n");
			else
				sb.append("no\n\n");
		}
		System.out.print(sb);
	}
}