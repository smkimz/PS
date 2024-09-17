import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static class Point {
		int row, col;

		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int N, M;
	static char[][] map;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		boolean startLocationChecker = false;
		int[] start = new int[2];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
			if (!startLocationChecker) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] != 'I')
						continue;
					start[0] = i;
					start[1] = j;
					map[i][j] = 'O';
					startLocationChecker = true;
					break;
				}
			}
		}
		checkMap(start);
	}

	static void checkMap(int[] start) {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		ArrayDeque<Point> dq = new ArrayDeque<>();
		dq.add(new Point(start[0], start[1]));
		boolean[][] vt = new boolean[N][M];
		vt[start[0]][start[1]] = true;
		int ans = 0, dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (map[p.row][p.col] == 'P')
				++ans;
			for (int i = 0; i < 4; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1 || map[dr][dc] == 'X' || vt[dr][dc])
					continue;
				dq.add(new Point(dr, dc));
				vt[dr][dc] = true;
			}
		}
		System.out.print(ans == 0 ? "TT" : ans);
	}
}