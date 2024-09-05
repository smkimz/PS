import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static char[][] stars;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = N * 2 - 1;
		stars = new char[N][M];
		for (int i = 0; i < N; i++) {
			Arrays.fill(stars[i], ' ');
			for (int j = M / 2 - i; j <= M / 2 + i; j++)
				stars[i][j] = '*';
		}
		eraseStars(0, M / 2, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				sb.append(stars[i][j]);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void eraseStars(int row, int col, int len) {
		int hLen = len / 2, d;
		int rStart = row + hLen, rEnd = row + len;
		int cStart = col - hLen, cEnd = col + hLen;
		for (int i = rStart; i <= rEnd; i++) {
			d = i - rStart + 1;
			for (int j = cStart + d; j <= cEnd - d; j++)
				stars[i][j] = ' ';
		}

		if (len == 3)
			return;

		eraseStars(row, col, hLen);
		eraseStars(row + hLen, col - hLen, hLen);
		eraseStars(row + hLen, col + hLen, hLen);
	}
}