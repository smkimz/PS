import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int R, C;
	static char[][] map;
	static char[] move;
	static boolean[][] vision;
	static int[][] dt = { { -1, 1, 0, 0 }, { 0, 0, -1, 1 } };

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
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		vision = new boolean[R][C];
		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		int sRow = Integer.parseInt(st.nextToken()) - 1, sCol = Integer.parseInt(st.nextToken()) - 1;
		move = br.readLine().toCharArray();
		exploreMap(sRow, sCol);
		print();
	}

	static void exploreMap(int sRow, int sCol) {
		int idx = 0, row = sRow, col = sCol, dir, dr, dc;
		HashMap<Character, Integer> directions = new HashMap<Character, Integer>();
		directions.put('U', 0);
		directions.put('D', 1);
		directions.put('L', 2);
		directions.put('R', 3);
		while (idx < move.length) {
			if (move[idx] == 'W') {
				useWard(row, col);
				++idx;
				continue;
			}
			dir = directions.get(move[idx]);
			row += dt[0][dir];
			col += dt[1][dir];
			++idx;
		}
		vision[row][col] = true;
		for (int i = 0; i < 4; i++) {
			dr = row + dt[0][i];
			dc = col + dt[1][i];
			if (dr < 0 || dr > R - 1 || dc < 0 || dc > C - 1)
				continue;
			vision[dr][dc] = true;
		}
	}

	static void useWard(int sRow, int sCol) {
		if (vision[sRow][sCol])
			return;
		vision[sRow][sCol] = true;
		char area = map[sRow][sCol];
		Deque<Point> dq = new ArrayDeque<>();
		dq.add(new Point(sRow, sCol));
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			for (int i = 0; i < 4; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > R - 1 || dc < 0 || dc > C - 1 || map[dr][dc] != area || vision[dr][dc])
					continue;
				vision[dr][dc] = true;
				dq.add(new Point(dr, dc));
			}
		}
	}

	static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				sb.append(vision[i][j] ? '.' : '#');
			sb.append("\n");
		}
		System.out.print(sb);
	}
}