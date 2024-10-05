import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayDeque<Character> deque = new ArrayDeque<>();
		int T = Integer.parseInt(br.readLine()), N;
		char c;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine()) - 1;
			st = new StringTokenizer(br.readLine());
			deque.add(st.nextToken().charAt(0));
			while (--N >= 0) {
				c = st.nextToken().charAt(0);
				if (c <= deque.peekFirst())
					deque.addFirst(c);
				else
					deque.addLast(c);
			}
			while (!deque.isEmpty())
				sb.append(deque.poll());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}