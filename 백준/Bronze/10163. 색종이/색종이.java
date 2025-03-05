import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y, w, h, a;
		int[][] board = new int[1002][1002];
		int[] area = new int[N + 1];
		for (int t = 1; t <= N; t++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			a = 0;
			for (int i = x; i < x + w; i++) {
				for (int j = y; j < y + h; j++) {
					if (board[i][j] > 0)
						--area[board[i][j]];
					board[i][j] = t;
					++a;
				}
			}
			area[t] = a;
		}
		for (int i = 1; i <= N; i++)
			sb.append(area[i]).append("\n");
		System.out.print(sb);
	}
}