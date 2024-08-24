import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), L, C;
		int[][] dp = new int[2][X + 1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			for (int j = 1; j <= X; j++) {
				dp[i % 2][j] = 0;
				if (j % L == 0 && j / L <= C)
					dp[i % 2][j] = 1;
				for (int k = 0; k <= C; k++) {
					if (j < L * k)
						break;
					dp[i % 2][j] += dp[(i + 1) % 2][j - L * k];
				}
			}
		}
		System.out.println(dp[(N + 1) % 2][X]);
	}
}