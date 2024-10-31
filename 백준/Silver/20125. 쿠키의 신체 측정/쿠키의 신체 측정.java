import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static char[][] cookie;
	static int[] heart = new int[2], length = new int[5];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		cookie = new char[N][N];
		for (int i = 0; i < N; i++)
			cookie[i] = br.readLine().toCharArray();
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if (cookie[r][c] == '_')
					continue;
				heart[0] = r + 1;
				heart[1] = c;
				checkCookie(heart[0], heart[1], 0, 0);
				checkCookie(heart[0], heart[1], 1, 1);
				r = checkCookie(heart[0], heart[1], 2, 2);
				checkCookie(r, heart[1] - 1, 2, 3);
				checkCookie(r, heart[1] + 1, 2, 4);
				sb.append(heart[0] + 1).append(" ").append(heart[1] + 1).append("\n");
				for (int i = 0; i <= 4; i++)
					sb.append(length[i]).append(" ");
				System.out.print(sb);
				return;
			}
		}
	}

	private static int checkCookie(int r, int c, int dir, int idx) {
		if (dir == 0) {
			while (c - 1 >= 0 && cookie[r][c - 1] == '*') {
				--c;
				++length[idx];
			}
			return c;
		} else if (dir == 1) {
			while (c + 1 <= N - 1 && cookie[r][c + 1] == '*') {
				++c;
				++length[idx];
			}
			return c;
		} else if (dir == 2) {
			while (r + 1 <= N - 1 && cookie[r + 1][c] == '*') {
				++r;
				++length[idx];
			}
			return r;
		}
		return 0;
	}
}