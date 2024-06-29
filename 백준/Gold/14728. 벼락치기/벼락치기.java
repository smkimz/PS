import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken()), K, S;
		int[][] dp = new int[2][T + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			K = Integer.parseInt(st.nextToken());
			S = Integer.parseInt(st.nextToken());
			for (int j = 1; j <= T; j++) {
				if (K <= j)
					dp[i % 2][j] = Math.max(dp[(i - 1) % 2][j - K] + S, dp[(i - 1) % 2][j]);
				else
					dp[i % 2][j] = dp[(i - 1) % 2][j];
			}
		}
		System.out.print(Math.max(dp[0][T], dp[1][T]));
	}
}