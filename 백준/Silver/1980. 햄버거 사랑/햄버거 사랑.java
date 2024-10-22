import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				T = Integer.parseInt(st.nextToken()), x, y, z;
		int[] ans = new int[2];
		ans[0] = Integer.MAX_VALUE;
		ans[1] = -1;
		for (int i = 0; i <= T / N; i++) {
			x = i;
			y = (T - x * N) / M;
			z = T - x * N - y * M;
			if (z == ans[0] && x + y > ans[1])
				ans[1] = x + y;
			else if (z < ans[0]) {
				ans[0] = z;
				ans[1] = x + y;
			}
		}
		System.out.printf("%d %d", ans[1], ans[0]);
	}
}