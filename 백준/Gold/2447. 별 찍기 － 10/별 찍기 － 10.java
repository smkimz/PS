import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static char[][] stars;

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		stars = new char[N][N];
		for (int i = 0; i < N; i++)
			Arrays.fill(stars[i], '*');
		eraseStars(0, 0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				sb.append(stars[i][j]);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void eraseStars(int r, int c, int len) {
		int l = len / 3;
		for (int i = r + l; i < r + 2 * l; i++) {
			for (int j = c + l; j < c + 2 * l; j++)
				stars[i][j] = ' ';
		}

		if (len == 3)
			return;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				eraseStars(r + l * i, c + l * j, l);
			}
		}
	}
}
