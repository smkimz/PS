import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	static int[][] board = new int[5][5], dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
	static HashMap<Integer, Boolean> checker = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		board = new int[5][5];
		StringTokenizer st;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				checkBoard(i, j, 0, 0);
			}
		}

		System.out.println(checker.size());
	}

	static void checkBoard(int row, int col, int depth, int num) {
		num = num * 10 + board[row][col];
		if (depth == 5) {
			checker.put(num, true);
			return;
		}
		int dr, dc;
		for (int i = 0; i < 4; i++) {
			dr = row + dt[0][i];
			dc = col + dt[1][i];
			if (dr < 0 || dr > 4 || dc < 0 || dc > 4)
				continue;
			checkBoard(dr, dc, depth + 1, num);
		}
	}
}