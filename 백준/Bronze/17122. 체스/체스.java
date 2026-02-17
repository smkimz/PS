import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x, y;
		char[] c;
		StringTokenizer st;
		boolean[] board = new boolean[64];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0)
					board[i * 8 + j] = j % 2 == 0 ? false : true;
				else
					board[i * 8 + j] = j % 2 == 0 ? true : false;
			}
		}
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			c = st.nextToken().toCharArray();
			x = (c[1] - '1') * 8 + c[0] - 'A';
			y = Integer.parseInt(st.nextToken()) - 1;
			sb.append(board[x] == board[y] ? "YES\n" : "NO\n");
		}
		System.out.print(sb);
	}
}