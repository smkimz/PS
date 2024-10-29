import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] board = new char[8][8];
		for (int i = 0; i < 8; i++)
			board[i] = br.readLine().toCharArray();
		int queen = 8, x, y;
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if (board[r][c] == '.')
					continue;
				--queen;
				for (int i = c + 1; i < 8; i++) {
					if (board[r][i] == '.')
						continue;
					System.out.println("invalid");
					return;
				}
				for (int i = r + 1; i < 8; i++) {
					if (board[i][c] == '.')
						continue;
					System.out.println("invalid");
					return;
				}
				for (int i = 1; i < 8; i++) {
					x = c + i;
					y = r + i;
					if (x >= 8 || y >= 8)
						break;
					if (board[y][x] == '.')
						continue;
					System.out.println("invalid");
					return;
				}
				for (int i = 1; i < 8; i++) {
					x = c - i;
					y = r + i;
					if (x < 0 || y >= 8)
						break;
					if (board[y][x] == '.')
						continue;
					System.out.println("invalid");
					return;
				}
				break;
			}
		}
		if (queen == 0)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}
}