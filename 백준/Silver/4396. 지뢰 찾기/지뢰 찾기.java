import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), dr, dc, mineCount;
		int[][] dt = new int[][] { { 0, 1, 1, 1, 0, -1, -1, -1 }, { 1, 1, 0, -1, -1, -1, 0, 1 } };
		char[][] board = new char[N][N], ans = new char[N][N];
		ArrayDeque<Mine> mines = new ArrayDeque<>();
		for (int i = 0; i < N; i++)
			board[i] = br.readLine().toCharArray();
		char[] input;
		boolean mineExplosion = false;
		Mine mine;
		for (int i = 0; i < N; i++) {
			input = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				if (board[i][j] == '*') {
					mines.add(new Mine(i, j));
					if (input[j] == 'x')
						mineExplosion = true;
					if (mineExplosion)
						continue;
				}
				if (input[j] == '.') {
					ans[i][j] = '.';
					continue;
				}
				mineCount = 0;
				for (int k = 0; k < 8; k++) {
					dr = i + dt[0][k];
					dc = j + dt[1][k];
					if (dr < 0 || dr >= N || dc < 0 || dc >= N)
						continue;
					if (board[dr][dc] == '*')
						++mineCount;
				}
				ans[i][j] = (char) ('0' + mineCount);
			}
		}
		if (mineExplosion) {
			while (!mines.isEmpty()) {
				mine = mines.poll();
				ans[mine.row][mine.col] = '*';
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				sb.append(ans[i][j]);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static class Mine {
		int row, col;

		public Mine(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
}