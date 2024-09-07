import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Character> stack = new ArrayDeque<>();
		char[] str;
		p: while (true) {
			str = br.readLine().toCharArray();
			if (str[0] == '.')
				break;
			for (int i = 0; i < str.length; i++) {
				if (str[i] == '(' || str[i] == '[') {
					stack.add(str[i]);
					continue;
				} else if (str[i] == ')' || str[i] == ']') {
					if (stack.isEmpty()) {
						sb.append("no").append("\n");
						continue p;
					}
					if ((str[i] == ')' && stack.peekLast() == '(') || (str[i] == ']' && stack.peekLast() == '[')) {
						stack.pollLast();
						continue;
					}
					stack.add(str[i]);
					continue;
				}
			}

			if (stack.isEmpty())
				sb.append("yes");
			else
				sb.append("no");
			sb.append("\n");
			stack.clear();
		}

		System.out.print(sb);
	}
}