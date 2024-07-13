import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, dist;

		public Point(int row, int col, int dist) {
			this.row = row;
			this.col = col;
			this.dist = dist;
		}
	}

	static int N, M, ans = -1;
	static boolean[][] map;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		Deque<Point> temp = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = st.nextToken().equals("0") ? false : true;
				if (map[i][j])
					continue;
				temp.add(new Point(i, j, 0));
			}
		}

		Point p;
		while (!temp.isEmpty()) {
			p = temp.poll();
			checkMap(p.row, p.col);
		}
		System.out.println(ans);
	}

	static void checkMap(int r, int c) {
		Deque<Point> dq = new ArrayDeque<>();
		dq.add(new Point(r, c, 0));
		boolean[][] vt = new boolean[N][M];
		vt[r][c] = true;
		int[][] dt = { { -1, 0, 1, 1, 1, 0, -1, -1 }, { 1, 1, 1, 0, -1, -1, -1, 0 } };
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			for (int i = 0; i <= 7; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1 || vt[dr][dc])
					continue;
				if (map[dr][dc]) {
					ans = Math.max(ans, p.dist + 1);
					return;
				}
				dq.add(new Point(dr, dc, p.dist + 1));
				vt[dr][dc] = true;
			}
		}
	}
}