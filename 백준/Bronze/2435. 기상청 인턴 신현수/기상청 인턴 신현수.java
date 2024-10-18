import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), ans = -201;
		int[] pSum = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		pSum[1] = Integer.parseInt(st.nextToken());
		if (N == 1) {
			System.out.println(pSum[1]);
			return;
		}
		for (int i = 2; i <= N; i++) {
			pSum[i] = Integer.parseInt(st.nextToken()) + pSum[i - 1];
			if (i >= K)
				ans = Math.max(ans, pSum[i] - pSum[i - K]);
		}
		System.out.println(ans);
	}
}