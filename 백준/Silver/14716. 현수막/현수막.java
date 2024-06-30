import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col;

		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans = 0;
		char[][] map = new char[N][M];
		boolean[][] vt = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = st.nextToken().charAt(0);
		}

		int[][] dt = { { 1, 0, -1, -1, -1, 0, 1, 1 }, { 1, 1, 1, 0, -1, -1, -1, 0 } };
		int dr, dc;
		Point p;
		Deque<Point> dq = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == '0' || vt[i][j])
					continue;
				dq.add(new Point(i, j));
				vt[i][j] = true;
				ans++;
				while (!dq.isEmpty()) {
					p = dq.poll();
					for (int k = 0; k <= 7; k++) {
						dr = p.row + dt[0][k];
						dc = p.col + dt[1][k];
						if (dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1 || map[dr][dc] == '0' || vt[dr][dc])
							continue;
						dq.add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
				}
			}
		}
		System.out.println(ans);
	}
}