import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long ans = 0;
		long[] sum = new long[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			sum[i] = sum[i - 1] + Long.parseLong(st.nextToken());
		for (int i = 1; i < N; i++)
			ans += (sum[i] - sum[i - 1]) * (sum[N] - sum[i]);
		System.out.println(ans);
	}
}