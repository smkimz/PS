import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	static char[][] board = new char[5][5];
	static HashMap<String, Boolean> checker = new HashMap<>();
	static int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		board = new char[5][5];
		StringTokenizer st;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				board[i][j] = st.nextToken().charAt(0);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				checkBoard(i, j, 0, "");
			}
		}

		System.out.println(checker.size());
	}

	static void checkBoard(int row, int col, int depth, String num) {
		num += board[row][col];
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