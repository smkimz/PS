import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++)
				arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i][j - 1] + arr[i - 1][j] - arr[i - 1][j - 1];
		}

		int K = Integer.parseInt(br.readLine()), res;
		int[] P = new int[4];
		while (--K >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++)
				P[i] = Integer.parseInt(st.nextToken());
			res = arr[P[2]][P[3]] - arr[P[0] - 1][P[3]] - arr[P[2]][P[1] - 1] + arr[P[0] - 1][P[1] - 1];
			sb.append(res).append("\n");
		}
		System.out.print(sb);
	}
}