import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), min = Integer.MAX_VALUE;
		char[][] board = new char[N][M];
		int[][][] count = new int[2][N][M - 7];
		for (int i = 0; i < N; i++)
			board[i] = br.readLine().toCharArray();
		for (int r = 0; r < N; r++) {
			for (int c = 0; c <= M - 8; c++) {
				for (int i = 0; i < 8; i++) {
					if (i % 2 == 0) {
						if (board[r][c + i] == 'W')
							++count[0][r][c];
						else
							++count[1][r][c];
					} else {
						if (board[r][c + i] == 'W')
							++count[1][r][c];
						else
							++count[0][r][c];
					}
				}
			}
		}

		int W, B;
		for (int r = 0; r <= N - 8; r++) {
			for (int c = 0; c <= M - 8; c++) {
				W = 0;
				B = 0;
				for (int i = 0; i < 8; i++) {
					if (i % 2 == 0) {
						B += count[0][r + i][c];
						W += count[1][r + i][c];
					} else {
						B += count[1][r + i][c];
						W += count[0][r + i][c];
					}
				}
				min = Math.min(min, Math.min(B, W));
			}
		}
		System.out.println(min);
	}
}