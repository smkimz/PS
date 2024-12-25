import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, M = 42;
		int[] fib = new int[M + 1];
		fib[0] = 1;
		fib[1] = 2;
		for (int i = 2; i <= M; i++)
			fib[i] = fib[i - 1] + fib[i - 2];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			for (int i = M; i >= 0; i--) {
				if (N < fib[i])
					continue;
				stack.add(fib[i]);
				N -= fib[i];
			}
			while (!stack.isEmpty())
				sb.append(stack.pollLast()).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}