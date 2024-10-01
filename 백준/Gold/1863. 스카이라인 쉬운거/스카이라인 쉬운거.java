import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()), y, ans = 0;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			y = Integer.parseInt(st.nextToken());
			while (!stack.isEmpty() && y < stack.peekLast()) {
				stack.pollLast();
				++ans;
			}
			if (y == 0 || (!stack.isEmpty() && stack.peekLast() == y))
				continue;
			stack.add(y);
		}
		ans += stack.size();
		System.out.println(ans);
	}
}