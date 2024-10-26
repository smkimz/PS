import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		char[] S = br.readLine().toCharArray();
		if (N % 2 == 1) {
			System.out.println(-1);
			return;
		}
		ArrayDeque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			if (!stack.isEmpty()
					&& ((S[i] == ')' && stack.peekLast() == '(') || (S[i] == '(' && stack.peekLast() == ')'))) {
				max = Math.max(max, stack.size());
				stack.pollLast();
				continue;
			}
			stack.add(S[i]);
		}
		if (stack.isEmpty())
			System.out.println(max);
		else
			System.out.println(-1);
	}
}