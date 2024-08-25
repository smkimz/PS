import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), X, Y, min = Integer.MAX_VALUE;
		char[][] board = new char[N][M];
		int[][][] count = new int[2][N][M - 7];
		for (int r = 0; r < N; r++) {
			board[r] = br.readLine().toCharArray();
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					if (board[r][i] == 'W')
						++count[0][r][0];
					else
						++count[1][r][0];
				} else {
					if (board[r][i] == 'W')
						++count[1][r][0];
					else
						++count[0][r][0];
				}
			}

			for (int c = 1; c <= M - 8; c++) {
				count[0][r][c] = count[1][r][c - 1];
				count[1][r][c] = count[0][r][c - 1];
				if (board[r][c - 1] == 'W')
					--count[1][r][c];
				else
					--count[0][r][c];
				if (board[r][c + 7] == 'W')
					++count[1][r][c];
				else
					++count[0][r][c];
			}
		}

		for (int c = 0; c <= M - 8; c++) {
			X = 0;
			Y = 0;
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					X += count[0][i][c];
					Y += count[1][i][c];
				} else {
					X += count[1][i][c];
					Y += count[0][i][c];
				}
			}
			min = Math.min(min, Math.min(X, Y));
			for (int r = 1; r <= N - 8; r++) {
				if (r % 2 == 1) {
					X += count[0][r + 7][c] - count[0][r - 1][c];
					Y += count[1][r + 7][c] - count[1][r - 1][c];
				} else {
					X += count[1][r + 7][c] - count[1][r - 1][c];
					Y += count[0][r + 7][c] - count[0][r - 1][c];
				}
				min = Math.min(min, Math.min(X, Y));
			}
		}
		System.out.println(min);
	}
}