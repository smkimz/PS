import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), n, m, a, b, p, q;
		double W, S, A, max, min;
		int[][] scores;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			scores = new int[n + 1][2];
			max = 0;
			min = Integer.MAX_VALUE;
			while (--m >= 0) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				p = Integer.parseInt(st.nextToken());
				q = Integer.parseInt(st.nextToken());
				scores[a][0] += p;
				scores[a][1] += q;
				scores[b][0] += q;
				scores[b][1] += p;
			}
			for (int i = 1; i <= n; i++) {
				S = Math.pow(scores[i][0], 2);
				A = Math.pow(scores[i][1], 2);
				if (S == 0 && A == 0)
					W = 0;
				else
					W = S / (S + A);
				max = Math.max(max, W);
				min = Math.min(min, W);
			}
			sb.append((int) (max * 1000)).append("\n").append((int) (min * 1000)).append("\n");
		}
		System.out.print(sb);
	}
}
