import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N <= 3) {
			System.out.println(1);
			return;
		}
		long[] dp = new long[N + 1];
		for (int i = 1; i <= 3; i++)
			dp[i] = 1;
		for (int i = 4; i <= N; i++)
			dp[i] = dp[i - 1] + dp[i - 3];
		System.out.println(dp[N]);
	}
}