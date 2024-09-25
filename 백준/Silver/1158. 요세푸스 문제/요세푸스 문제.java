import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("<");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), count = 0, element;
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			if (++count == K) {
				sb.append(i).append(", ");
				count = 0;
				continue;
			}
			queue.add(i);
		}
		while (!queue.isEmpty()) {
			element = queue.poll();
			if (++count == K) {
				sb.append(element).append(", ");
				count = 0;
				continue;
			}
			queue.add(element);
		}
		sb.delete(sb.length() - 2, sb.length()).append(">");
		System.out.println(sb);
	}
}