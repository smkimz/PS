import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Character> stack = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] str;
		while (--N >= 0) {
			str = br.readLine().toCharArray();
			if (str.length % 2 == 1)
				continue;
			for (int i = 0; i < str.length; i++) {
				if (stack.isEmpty() || str[i] != stack.peekLast())
					stack.add(str[i]);
				else
					stack.pollLast();
			}
			ans += stack.isEmpty() ? 1 : 0;
			stack.clear();
		}
		System.out.println(ans);
	}
}