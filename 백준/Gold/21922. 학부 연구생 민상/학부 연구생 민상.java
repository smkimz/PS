import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static class Point {
		int row, col, dir;

		public Point(int row, int col, int dir) {
			this.row = row;
			this.col = col;
			this.dir = dir;
		}
	}

	static int N, M, ans = 0;
	static char[][] map;
	static int[][] vt;
	static ArrayDeque<Point> dq = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		vt = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = st.nextToken().charAt(0);
				if (map[i][j] != '9')
					continue;
				map[i][j] = '0';
				for (int k = 0; k < 4; k++)
					dq.add(new Point(i, j, k));
				vt[i][j] = 15;
				++ans;
			}
		}
		checkAirflow();
	}

	static void checkAirflow() {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr = 0, dc = 0, dir = 0, dirToBit;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (map[p.row][p.col] == '1') {
				if (p.dir % 2 == 0) {
					dir = (p.dir + 2) % 4;
					dr = p.row;
					dc = p.col + dt[1][dir];
				} else {
					dir = p.dir;
					dr = p.row + dt[0][p.dir];
					dc = p.col;
				}
			} else if (map[p.row][p.col] == '2') {
				if (p.dir % 2 == 0) {
					dir = p.dir;
					dr = p.row;
					dc = p.col + dt[1][p.dir];
				} else {
					dir = (p.dir + 2) % 4;
					dr = p.row + dt[0][dir];
					dc = p.col;
				}
			} else if (map[p.row][p.col] == '3') {
				if (p.dir % 2 == 0)
					dir = (p.dir + 3) % 4;
				else
					dir = (p.dir + 1) % 4;
				dr = p.row + dt[0][dir];
				dc = p.col + dt[1][dir];
			} else if (map[p.row][p.col] == '4') {
				if (p.dir % 2 == 0)
					dir = (p.dir + 1) % 4;
				else
					dir = (p.dir + 3) % 4;
				dr = p.row + dt[0][dir];
				dc = p.col + dt[1][dir];
			} else {
				dir = p.dir;
				dr = p.row + dt[0][dir];
				dc = p.col + dt[1][dir];
			}
			dirToBit = (int) Math.pow(2, dir);
			if (!isMovable(dr, dc, dirToBit))
				continue;
			dq.add(new Point(dr, dc, dir));
			if (vt[dr][dc] == 0)
				++ans;
			vt[dr][dc] += dirToBit;
		}
		System.out.println(ans);
	}

	static boolean isMovable(int dr, int dc, int dir) {
		return dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && (vt[dr][dc] & dir) != dir;
	}
}