import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	static HashSet<Integer> unused = new HashSet<>();
	static int[][] board = new int[8][7];
	static boolean[][] visited = new boolean[8][7];
	static int ans = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= 6; i++) {
			for (int j = i; j <= 6; j++)
				unused.add(i * 10 + j);
		}
		char[] input;
		for (int i = 0; i < 8; i++) {
			input = br.readLine().toCharArray();
			for (int j = 0; j < 7; j++)
				board[i][j] = input[j] - '0';
		}
		arrangeDomino(0, 0);
		System.out.println(ans);
	}

	static void arrangeDomino(int r, int c) {
		if (r == 7 && c == 7) {
			++ans;
			return;
		}
		if (c == 7) {
			arrangeDomino(r + 1, 0);
			return;
		}
		if (visited[r][c]) {
			arrangeDomino(r, c + 1);
			return;
		}

		int dominoA, dominoB;
		if (c <= 5) {
			dominoA = board[r][c] * 10 + board[r][c + 1];
			dominoB = board[r][c] + board[r][c + 1] * 10;
			useDomino(r, c, r, c + 1, Math.min(dominoA, dominoB), Math.max(dominoA, dominoB));
		}
		if (r <= 6) {
			dominoA = board[r][c] * 10 + board[r + 1][c];
			dominoB = board[r][c] + board[r + 1][c] * 10;
			useDomino(r, c, r + 1, c, Math.min(dominoA, dominoB), Math.max(dominoA, dominoB));
		}
	}

	static void useDomino(int r1, int c1, int r2, int c2, int d1, int d2) {
		if (unused.contains(d1) && !visited[r2][c2]) {
			if (board[r1][c1] * 10 + board[r2][c2] == d1 || board[r1][c1] + board[r2][c2] * 10 == d1
					|| board[r1][c1] * 10 + board[r2][c2] == d2 || board[r1][c1] + board[r2][c2] * 10 == d2) {
				unused.remove(d1);
				visited[r1][c1] = true;
				visited[r2][c2] = true;
				arrangeDomino(r1, c1 + 1);
				unused.add(d1);
				visited[r1][c1] = false;
				visited[r2][c2] = false;
			}
		}
	}
}