import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		ArrayDeque<Character> stackA, stackB;
		char[] keylog;
		while (--T >= 0) {
			keylog = br.readLine().toCharArray();
			stackA = new ArrayDeque<>();
			stackB = new ArrayDeque<>();
			for (int i = 0; i < keylog.length; i++) {
				if (keylog[i] == '<') {
					if (stackA.isEmpty())
						continue;
					stackB.add(stackA.removeLast());
				} else if (keylog[i] == '>') {
					if (stackB.isEmpty())
						continue;
					stackA.add(stackB.removeLast());
				} else if (keylog[i] == '-') {
					if (stackA.isEmpty())
						continue;
					stackA.removeLast();
				} else
					stackA.add(keylog[i]);
			}
			while (!stackA.isEmpty())
				sb.append(stackA.poll());
			while (!stackB.isEmpty())
				sb.append(stackB.pollLast());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}