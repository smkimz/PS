import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[3];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= N; i++)
			dp[i % 3] = (dp[(i + 1) % 3] + dp[(i + 2) % 3]) % 10;
		System.out.println(dp[N % 3]);
	}
}