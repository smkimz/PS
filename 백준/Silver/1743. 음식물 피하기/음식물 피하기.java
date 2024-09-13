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

	static int N, M, max = 0;
	static boolean[][] map;
	static int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		while (--K >= 0) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = true;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!map[i][j])
					continue;
				checkMap(i, j);
			}
		}
		System.out.println(max);
	}

	static void checkMap(int startR, int startC) {
		ArrayDeque<Point> dq = new ArrayDeque<>();
		map[startR][startC] = false;
		dq.add(new Point(startR, startC));
		int dr, dc, size = 1;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			for (int i = 0; i < 4; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1 || !map[dr][dc])
					continue;
				map[dr][dc] = false;
				++size;
				dq.add(new Point(dr, dc));
			}
		}
		max = Math.max(max, size);
	}
}