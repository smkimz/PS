import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), max = 0;
		int[] memory = new int[N + 1], cost = new int[N + 1];
		int[][] dp = new int[2][10001];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			memory[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
			max += cost[i];
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= max; j++) {
				if (cost[i] > j)
					dp[i % 2][j] = dp[(i - 1) % 2][j];
				else
					dp[i % 2][j] = Math.max(dp[(i - 1) % 2][j], dp[(i - 1) % 2][j - cost[i]] + memory[i]);
			}
		}
		for (int i = 0; i <= max; i++) {
			if (dp[N % 2][i] < M)
				continue;
			System.out.println(i);
			return;
		}
	}
}