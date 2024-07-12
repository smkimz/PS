import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), L = Math.min(N, M);
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++)
			map[i] = br.readLine().toCharArray();
		for (int i = L - 1; i >= 0; i--) {
			int[][] p = { { 0, i, 0, i }, { 0, 0, i, i } };
			for (int r = 0; r < N - i; r++) {
				p: for (int c = 0; c < M - i; c++) {
					for (int x = 0; x <= 3; x++) {
						if (map[r][c] != map[r + p[0][x]][c + p[1][x]])
							continue p;
					}
					System.out.println((int) Math.pow(i + 1, 2));
					return;
				}
			}
		}
	}
}