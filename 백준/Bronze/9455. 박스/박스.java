import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, M, sum;
		int[][] cnt;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			sum = 0;
			cnt = new int[M][2];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					if (st.nextToken().equals("0"))
						continue;
					++cnt[j][0];
					cnt[j][1] += N - i - 1;
				}
			}
			for (int i = 0; i < M; i++)
				sum += cnt[i][1] - --cnt[i][0] * (cnt[i][0] + 1) / 2;
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}