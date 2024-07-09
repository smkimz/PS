import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, pow;

		public Point(int row, int col, int pow) {
			this.row = row;
			this.col = col;
			this.pow = pow;
		}
	}

	static int N, M;
	static int[] ans = new int[2];
	static char[][] map;
	static Deque<Point> dq = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if (map[i][j] == '*' || map[i][j] == '#')
					++ans[0];
				else if (map[i][j] == '@') {
					dq.add(new Point(i, j, 2));
					map[i][j] = '.';
				}
			}
		}
		checkEarthquake();
		System.out.println(ans[1] + " " + ans[0]);
	}

	static void checkEarthquake() {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			x: for (int i = 0; i <= 3; i++) {
				for (int j = 1; j <= p.pow; j++) {
					dr = p.row + dt[0][i] * j;
					dc = p.col + dt[1][i] * j;
					if (isImmovable(dr, dc))
						continue x;
					if (map[dr][dc] == '*') {
						map[dr][dc] = '.';
						--ans[0];
						++ans[1];
						dq.add(new Point(dr, dc, 1));
					} else if (map[dr][dc] == '#')
						map[dr][dc] = '*';
				}
			}
		}
	}

	static boolean isImmovable(int r, int c) {
		return r < 0 || r > N - 1 || c < 0 || c > M - 1 || map[r][c] == '|';
	}
}