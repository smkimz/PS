import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), M;
		long[] A = new long[N + 1], B;
		long sum, count, ans = 0;
		HashMap<Long, Long> sums = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			A[i] = Long.parseLong(st.nextToken()) + A[i - 1];
		M = Integer.parseInt(br.readLine());
		B = new long[M + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= M; i++)
			B[i] = Long.parseLong(st.nextToken()) + B[i - 1];
		for (int i = 0; i <= N - 1; i++) {
			for (int j = i + 1; j <= N; j++) {
				sum = A[j] - A[i];
				count = sums.getOrDefault(sum, 0L);
				sums.put(sum, count + 1);
			}
		}
		for (int i = 0; i <= M - 1; i++) {
			for (int j = i + 1; j <= M; j++) {
				sum = B[j] - B[i];
				if (!sums.containsKey(T - sum))
					continue;
				ans += sums.get(T - sum);
			}
		}
		System.out.println(ans);
	}
}