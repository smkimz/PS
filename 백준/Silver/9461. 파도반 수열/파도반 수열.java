import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long[] dp = new long[101];
		for (int i = 1; i <= 3; i++)
			dp[i] = 1;
		for (int i = 4; i <= 5; i++)
			dp[i] = 2;
		for (int i = 6; i <= 100; i++)
			dp[i] = dp[i - 1] + dp[i - 5];
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++)
			sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
		System.out.print(sb);
	}
}