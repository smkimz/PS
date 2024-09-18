import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine()), X;
		while (--N >= 0) {
			X = Integer.parseInt(br.readLine());
			if (X != 0) {
				pq.add(X);
				continue;
			}
			if (pq.isEmpty())
				sb.append(0);
			else
				sb.append(pq.poll());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}