import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, time;

		public Point(int row, int col, int time) {
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}

	static int N, M, V, min;
	static char[][] map;
	static int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = 0;
		min = Integer.MAX_VALUE;
		map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++)
				V += map[i][j] == '1' ? 1 : 0;
		}
		int X = N * M;
		int[][] start = new int[2][2];
		for (int i = 0; i < X - 1; i++) {
			start[0][0] = i / M;
			start[0][1] = i % M;
			if (map[start[0][0]][start[0][1]] == '1')
				continue;
			for (int j = i + 1; j < X; j++) {
				start[1][0] = j / M;
				start[1][1] = j % M;
				if (map[start[1][0]][start[1][1]] == '1')
					continue;
				spreadPoison(start);
			}
		}
		System.out.print(min);
	}

	static void spreadPoison(int[][] start) {
		boolean[][] vt = new boolean[N][M];
		Deque<Point> dq = new ArrayDeque<>();
		for (int i = 0; i <= 1; i++) {
			vt[start[i][0]][start[i][1]] = true;
			dq.add(new Point(start[i][0], start[i][1], 0));
		}
		Point p;
		int count = 0, dr, dc;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (p.time >= min)
				return;
			if (map[p.row][p.col] == '1')
				++count;
			if (count == V) {
				min = p.time;
				return;
			}
			for (int i = 0; i < 4; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (checkMovement(dr, dc) || vt[dr][dc])
					continue;
				dq.add(new Point(dr, dc, p.time + 1));
				vt[dr][dc] = true;
			}
		}
	}

	static boolean checkMovement(int row, int col) {
		return row < 0 || row > N - 1 || col < 0 || col > M - 1;
	}
}