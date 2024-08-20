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

	static int R, C, N;
	static char[][] map;
	static int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
	static Deque<Point>[] dq = new ArrayDeque[2];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken()) - 1;
		map = new char[R][C];
		for (int i = 0; i <= 1; i++)
			dq[i] = new ArrayDeque<>();
		for (int i = 0; i < R; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 'O')
					dq[0].add(new Point(i, j));
			}
		}
		if (N == 0) {
			printMap();
			return;
		}

		int d = 0;
		while (true) {
			installBombs((d + 1) % 2);
			if (--N <= 0) {
				printMap();
				return;
			}
			detonateBombs(d % 2);
			if (--N <= 0) {
				printMap();
				return;
			}
			++d;
		}
	}

	static void installBombs(int d) {
		char bomb;
		if (d == 0)
			bomb = 'O';
		else
			bomb = 'X';
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] != '.')
					continue;
				map[i][j] = bomb;
				dq[d].add(new Point(i, j));
			}
		}
	}

	static void detonateBombs(int d) {
		char bomb;
		if (d == 0)
			bomb = 'O';
		else
			bomb = 'X';
		Point p;
		int dr, dc;
		while (!dq[d].isEmpty()) {
			p = dq[d].poll();
			if (map[p.row][p.col] != bomb)
				continue;
			for (int i = 0; i <= 3; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > R - 1 || dc < 0 || dc > C - 1 || map[dr][dc] == bomb)
					continue;
				map[dr][dc] = '.';
			}
			map[p.row][p.col] = '.';
		}
	}

	static void printMap() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				sb.append(map[i][j] == '.' ? '.' : 'O');
			sb.append("\n");
		}
		System.out.println(sb);
	}
}