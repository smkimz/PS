import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		PriorityQueue<Integer> presents = new PriorityQueue<>(Collections.reverseOrder());
		int n = Integer.parseInt(br.readLine()), a;
		while (--n >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			if (a != 0) {
				while (st.hasMoreTokens())
					presents.add(Integer.parseInt(st.nextToken()));
			} else {
				if (!presents.isEmpty())
					sb.append(presents.poll());
				else
					sb.append(-1);
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}