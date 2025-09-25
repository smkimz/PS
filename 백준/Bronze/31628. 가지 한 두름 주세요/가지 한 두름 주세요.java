import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] board = new String[10][10];
		boolean s;
		StringTokenizer st;
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++)
				board[i][j] = st.nextToken();
		}
		for (int i = 0; i < 10; i++) {
			s = false;
			for (int j = 0; j < 10; j++) {
				if (!board[i][i].equals(board[i][j])) {
					s = true;
					break;
				}
			}
			if (!s) {
				System.out.println(1);
				return;
			}
			s = false;
			for (int j = 0; j < 10; j++) {
				if (!board[i][i].equals(board[j][i])) {
					s = true;
					break;
				}
			}
			if (!s) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}