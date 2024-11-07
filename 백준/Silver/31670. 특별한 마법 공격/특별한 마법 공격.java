import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] dp = new long[N + 2];
		for (int i = 2; i <= N + 1; i++)
			dp[i] = Integer.parseInt(st.nextToken()) + Math.min(dp[i - 1], dp[i - 2]);
		System.out.println(Math.min(dp[N + 1], dp[N]));
	}
}