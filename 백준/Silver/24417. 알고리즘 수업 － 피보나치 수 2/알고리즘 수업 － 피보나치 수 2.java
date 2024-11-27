import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[4];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= N - 1; i++)
			dp[i % 3] = (dp[(i + 1) % 3] + dp[(i + 2) % 3]) % 1000000007;
		System.out.printf("%d %d", dp[(N - 1) % 3], N - 2);
	}
}