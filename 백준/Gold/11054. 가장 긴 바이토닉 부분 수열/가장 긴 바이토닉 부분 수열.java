import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		int[] arr = new int[N];
		int[][] dp = new int[2][N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			dp[0][i] = 1;
			for (int j = 0; j < i; j++)
				if (arr[i] > arr[j])
					dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1);
		}
		for (int i = N - 1; i >= 0; i--) {
			dp[1][i] = 1;
			for (int j = N - 1; j > i; j--)
				if (arr[i] > arr[j])
					dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
		}
		for (int i = 0; i < N; i++)
			ans = Math.max(ans, dp[0][i] + dp[1][i]);
		System.out.println(ans - 1);
	}
}