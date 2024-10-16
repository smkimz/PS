import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				Q = Integer.parseInt(st.nextToken()), x, y, v;
		int[][] arr = new int[3][];
		arr[1] = new int[N + 1];
		arr[2] = new int[M + 1];
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			arr[x][y] += v;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++)
				sb.append(arr[1][i] + arr[2][j]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}