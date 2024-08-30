import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N;
		long sum, max;
		int[][] coins;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			coins = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					coins[i][j] = Integer.parseInt(st.nextToken());
			}
			max = 0;
			for (int i = N - 1; i > 0; i--) {
				sum = 0;
				for (int j = 0; j <= N - 1 - i; j++)
					sum += coins[i + j][j];
				max = Math.max(max, sum);
			}
			for (int i = 0; i < N; i++) {
				sum = 0;
				for (int j = 0; j <= N - 1 - i; j++)
					sum += coins[j][i + j];
				max = Math.max(max, sum);
			}
			sb.append("Case #").append(t).append(": ").append(max).append("\n");
		}
		System.out.print(sb);
	}
}