import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = N * 2 + 1, dir = 0, row = M / 2, col = M / 2;
		char[] moves = br.readLine().toCharArray();
		int[] rowRange = { row, row }, colRange = { col, col };
		int[][] dt = { { 1, 0, -1, 0 }, { 0, -1, 0, 1 } };
		boolean[][] map = new boolean[M][M];
		map[row][col] = true;
		for (int i = 0; i < N; i++) {
			switch (moves[i]) {
			case 'F':
				row += dt[0][dir];
				col += dt[1][dir];
				map[row][col] = true;
				rowRange[0] = Math.min(rowRange[0], row);
				rowRange[1] = Math.max(rowRange[1], row);
				colRange[0] = Math.min(colRange[0], col);
				colRange[1] = Math.max(colRange[1], col);
				break;
			case 'L':
				dir = (dir + 3) % 4;
				break;
			case 'R':
				dir = (dir + 1) % 4;
				break;
			default:
				break;
			}
		}
		for (int i = rowRange[0]; i <= rowRange[1]; i++) {
			for (int j = colRange[0]; j <= colRange[1]; j++)
				sb.append(map[i][j] ? '.' : '#');
			sb.append("\n");
		}
		System.out.print(sb);
	}
}