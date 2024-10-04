import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final int MIN = -1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		int[][][] dp = new int[3][N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[0][i][j] = dp[1][i][j] = dp[2][i][j] = MIN;
			}
		}
		dp[0][0][0] = dp[1][0][0] = dp[2][0][0] = map[0][0];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (j >= 1)
					dp[0][i][j] = map[i][j] + Math.max(dp[0][i][j - 1], dp[1][i][j - 1]);
				if (i >= 1)
					dp[1][i][j] = map[i][j] + Math.max(dp[0][i - 1][j], Math.max(dp[1][i - 1][j], dp[2][i - 1][j]));
			}
			for (int j = M - 2; j >= 0; j--)
				dp[2][i][j] = map[i][j] + Math.max(dp[1][i][j + 1], dp[2][i][j + 1]);
		}
		System.out.println(Math.max(dp[0][N - 1][M - 1], dp[1][N - 1][M - 1]));
	}
}