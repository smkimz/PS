import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Deque<Character> dq = new ArrayDeque<Character>();
		int T = Integer.parseInt(br.readLine());
		char c;
		while (T-- > 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			dq.add(st.nextToken().charAt(0));
			while (st.hasMoreTokens()) {
				c = st.nextToken().charAt(0);
				if (c <= dq.peekFirst())
					dq.addFirst(c);
				else
					dq.addLast(c);
			}
			while (!dq.isEmpty())
				sb.append(dq.poll());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}