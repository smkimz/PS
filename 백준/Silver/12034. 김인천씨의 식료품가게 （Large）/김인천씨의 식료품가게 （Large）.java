import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, val;
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		for (int i = 1; i <= T; i++) {
			sb.append("Case #").append(i).append(": ");
			N = Integer.parseInt(br.readLine()) * 2;
			st = new StringTokenizer(br.readLine());
			while (--N >= 0) {
				val = Integer.parseInt(st.nextToken());
				if (!deque.isEmpty() && val == deque.peek() / 3 * 4)
					sb.append(deque.poll()).append(" ");
				else
					deque.add(val);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}