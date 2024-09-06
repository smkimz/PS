import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] S = br.readLine().toCharArray();
		ArrayDeque<Character> stack = new ArrayDeque<>();
		boolean flag = false;
		char c;
		for (int i = 0; i < S.length; i++) {
			c = S[i];

			if (flag) {
				sb.append(c);
				if (c == '>')
					flag = false;
				continue;
			}

			if (c == ' ' || c == '<') {
				if (c == '<')
					flag = true;
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(c);
				continue;
			}

			stack.push(c);
		}

		while (!stack.isEmpty())
			sb.append(stack.pop());
		System.out.print(sb);
	}
}