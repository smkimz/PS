import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X;
		int[] dp = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			X = Integer.parseInt(st.nextToken());
			for (int j = i; j >= 1; j--) {
				if (dp[j - 1] == 0)
					continue;
				if (dp[j - 1] >= X)
					dp[j] = Math.max(dp[j], dp[j - 1] + X);
			}
			dp[1] = Math.max(dp[i], X);
		}
		for (int i = N; i >= 1; i--) {
			if (dp[i] > 0) {
				System.out.println(i);
				return;
			}
		}
	}
}