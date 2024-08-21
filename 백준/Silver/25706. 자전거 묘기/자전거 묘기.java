import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] jump = new int[N], dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			jump[i] = Integer.parseInt(st.nextToken());
		for (int i = N - 1; i >= 0; i--) {
			if (i + jump[i] + 1 >= N) {
				dp[i] = 1;
				continue;
			}
			dp[i] = dp[i + jump[i] + 1] + 1;
		}
		for (int i = 0; i < N; i++)
			sb.append(dp[i]).append(" ");
		System.out.print(sb);
	}
}