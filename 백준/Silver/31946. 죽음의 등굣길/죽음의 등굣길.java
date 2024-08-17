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

	static int N, M, K;
	static char[][] map;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		map = new char[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = st.nextToken().charAt(0);
		}
		if (map[0][0] != map[N - 1][M - 1]) {
			System.out.println("DEAD");
			return;
		}
		K = Integer.parseInt(br.readLine());
		findRoute();
	}

	static void findRoute() {
		boolean[][] vt = new boolean[N][M];
		vt[0][0] = true;
		Deque<Point> dq = new ArrayDeque<>();
		dq.add(new Point(0, 0));
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (p.row == N - 1 && p.col == M - 1) {
				System.out.println("ALIVE");
				return;
			}
			for (int i = K; i >= 1; i--) {
				dr = p.row - i;
				dc = p.col;
				while (dr < p.row && dc < p.col + i) {
					if (dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && map[dr][dc] == map[0][0] && !vt[dr][dc]) {
						dq.add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
					++dr;
					++dc;
				}
				dr = p.row;
				dc = p.col + i;
				while (dr < p.row + i && dc > p.col) {
					if (dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && map[dr][dc] == map[0][0] && !vt[dr][dc]) {
						dq.add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
					++dr;
					--dc;
				}
				dr = p.row + i;
				dc = p.col;
				while (dr > p.row && dc > p.col - i) {
					if (dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && map[dr][dc] == map[0][0] && !vt[dr][dc]) {
						dq.add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
					--dr;
					--dc;
				}
				dr = p.row;
				dc = p.col - i;
				while (dr > p.row - i && dc < p.col) {
					if (dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && map[dr][dc] == map[0][0] && !vt[dr][dc]) {
						dq.add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
					--dr;
					++dc;
				}
			}
		}
		System.out.println("DEAD");
	}
}