import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				T = Integer.parseInt(st.nextToken()), A, B, x, y;
		int[][] time = new int[N + 1][2];
		int[] ans = new int[T + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			x = Math.max(time[A][0], time[B][0]);
			y = Math.min(time[A][1], time[B][1]);
			if (x >= y)
				continue;
			ans[x]++;
			ans[y]--;
		}

		sb.append(ans[0]).append("\n");
		for (int i = 1; i < T; i++) {
			ans[i] += ans[i - 1];
			sb.append(ans[i]).append("\n");
		}
		System.out.print(sb);
	}
}