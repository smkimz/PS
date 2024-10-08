import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans;
		int[] arr = new int[N], dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = arr[0];
		ans = dp[0];
		for (int i = 1; i < N; i++) {
			dp[i] = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j] + arr[i]);
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}
}
