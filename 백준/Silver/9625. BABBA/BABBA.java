import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[] dp = new int[K + 1];
		dp[1] = 1;
		for (int i = 2; i <= K; i++)
			dp[i] = dp[i - 1] + dp[i - 2];
		System.out.printf("%d %d", dp[K - 1], dp[K]);
	}
}