import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		if (N < M) {
			System.out.println(1);
			return;
		}
		int[] dp = new int[N + 1];
		for (int i = 0; i <= M - 1; i++)
			dp[i] = 1;
		for (int i = M; i <= N; i++)
			dp[i] = (dp[i - 1] + dp[i - M]) % 1000000007;
		System.out.println(dp[N]);
	}
}