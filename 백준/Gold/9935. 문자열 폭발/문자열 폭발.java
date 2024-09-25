import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray(), bomb = br.readLine().toCharArray();
		ArrayDeque<Character> stack = new ArrayDeque<>();
		ArrayDeque<Integer> checker = new ArrayDeque<>();
		int bombIdx = 0;
		for (int i = 0; i < str.length; i++) {
			stack.add(str[i]);
			if (str[i] == bomb[bombIdx]) {
				bombIdx++;
				if (bombIdx == bomb.length) {
					checker.addLast(-1);
					for (int j = 0; j < bomb.length; j++) {
						checker.pollLast();
						stack.pollLast();
					}
					if (checker.size() > 0)
						bombIdx = checker.peekLast();
					else
						bombIdx = 0;
					continue;
				}
			} else if (str[i] == bomb[0])
				bombIdx = 1;
			else
				bombIdx = 0;
			checker.add(bombIdx);
		}

		if (stack.size() == 0)
			System.out.print("FRULA");
		else {
			while (!stack.isEmpty())
				sb.append(stack.poll());
			System.out.print(sb);
		}
	}
}