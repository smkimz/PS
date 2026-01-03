import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> nums = new ArrayDeque<Integer>();
		ArrayDeque<Character> signs = new ArrayDeque<Character>();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		char c;
		int ctr, x, y;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			ctr = 0;
			while (st.hasMoreTokens()) {
				if (ctr++ % 2 == 0)
					nums.add(Integer.parseInt(st.nextToken()));
				else {
					c = st.nextToken().charAt(0);
					if (c == '+' || c == '-') {
						signs.add(c);
						continue;
					}
					x = nums.pollLast();
					y = Integer.parseInt(st.nextToken());
					++ctr;
					if (c == '*')
						x *= y;
					else if (c == '/')
						x /= y;
					else if (c == '%')
						x %= y;
					nums.add(x);
				}
			}
			while (!signs.isEmpty()) {
				c = signs.pollFirst();
				x = nums.pollFirst();
				y = nums.pollFirst();
				if (c == '+')
					x += y;
				else if (c == '-')
					x -= y;
				nums.addFirst(x);
			}
			sb.append(nums.pollFirst()).append("\n");
		}
		System.out.print(sb);
	}
}
