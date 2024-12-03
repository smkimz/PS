import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), a, x = 0, y = 0;
		char b, c;
		char[][] H = new char[2][N + 1];
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = st.nextToken().charAt(0);
			c = st.nextToken().charAt(0);
			if (b == 'P')
				H[0][a] = c;
			else
				H[1][a] = c;
		}
		for (int i = 1; i <= N; i++) {
			if ((H[0][i] == '1' || H[0][i] == 0) && (H[1][i] == '0' || H[1][i] == 0)) {
				++y;
				if (H[0][i] == '1' && H[1][i] == '0')
					++x;
			}
		}
		System.out.printf("%d %d", x, y);
	}
}