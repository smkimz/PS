import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static class Knight {
		int row, col, move;

		public Knight(int row, int col, int move) {
			this.row = row;
			this.col = col;
			this.move = move;
		}
	}

	static final int[][] DELTA = { { -2, -1, 1, 2, 2, 1, -1, -2 }, { -1, -2, -2, -1, 1, 2, 2, 1 } };
	static int I;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int TC = Integer.parseInt(br.readLine());
		int[][] loc = new int[2][2];
		while (--TC >= 0) {
			I = Integer.parseInt(br.readLine());
			for (int i = 0; i <= 1; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j <= 1; j++)
					loc[i][j] = Integer.parseInt(st.nextToken());
			}
			sb.append(bfs(loc[0][0], loc[0][1], loc[1][0], loc[1][1])).append("\n");
		}
		System.out.print(sb);
	}

	static int bfs(int sRow, int sCol, int eRow, int eCol) {
		ArrayDeque<Knight> dq = new ArrayDeque<>();
		boolean[][] vt = new boolean[I][I];
		dq.push(new Knight(sRow, sCol, 0));
		vt[sRow][sCol] = true;
		int dr, dc;
		Knight k;
		while (!dq.isEmpty()) {
			k = dq.poll();
			if (k.row == eRow && k.col == eCol)
				return k.move;
			for (int i = 0; i <= 7; i++) {
				dr = k.row + DELTA[0][i];
				dc = k.col + DELTA[1][i];
				if (!isMovable(dr, dc) || vt[dr][dc])
					continue;
				dq.add(new Knight(dr, dc, k.move + 1));
				vt[dr][dc] = true;
			}
		}
		return 0;
	}

	static boolean isMovable(int r, int c) {
		return r >= 0 && r <= I - 1 && c >= 0 && c <= I - 1;
	}
}
