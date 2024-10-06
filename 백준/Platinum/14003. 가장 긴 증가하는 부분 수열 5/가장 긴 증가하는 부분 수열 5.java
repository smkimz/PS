import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static final int MIN = Integer.MIN_VALUE;
	static int[] dp;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp = new int[N];
		Arrays.fill(dp, MIN);
		int[] seq = new int[N], indexes = new int[N];
		for (int i = 0; i < N; i++)
			seq[i] = Integer.parseInt(st.nextToken());
		dp[0] = seq[0];
		indexes[0] = 0;
		for (int i = 1; i < N; i++) {
			if (dp[x] < seq[i]) {
				dp[++x] = seq[i];
				y = x;
			} else {
				y = searchIndex(seq[i], x);
				dp[y] = seq[i];
			}
			indexes[i] = y;
		}
		sb.append(x + 1).append("\n");
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = N - 1; i >= 0; i--) {
			if (indexes[i] != x)
				continue;
			stack.add(seq[i]);
			--x;
		}
		while (!stack.isEmpty())
			sb.append(stack.pollLast()).append(" ");
		System.out.print(sb);
	}

	static int searchIndex(int val, int end) {
		int start = 0, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (dp[mid] < val)
				start = mid + 1;
			else if (dp[mid] > val)
				end = mid - 1;
			else
				return mid;
		}
		return start;
	}
}