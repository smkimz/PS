import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine()), r = N / 2, c = N / 2, curve = 0,
				cnt = 1, rep = 1, size = N * N;
		int[][] arr = new int[N][N], dt = { { -1, 0, 1, 0 }, { 0, 1, 0, -1 } };
		arr[r][c] = cnt;
		int[] loc = { r, c };
		while (cnt < size) {
			for (int i = 1; i <= rep && cnt < size; i++) {
				r += dt[0][curve % 4];
				c += dt[1][curve % 4];
				arr[r][c] = ++cnt;
				if (arr[r][c] != M)
					continue;
				loc[0] = r;
				loc[1] = c;
			}
			if (++curve % 2 == 0)
				++rep;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				sb.append(arr[i][j]).append(" ");
			sb.append("\n");
		}
		sb.append(++loc[0]).append(" ").append(++loc[1]);
		System.out.println(sb);
	}
}