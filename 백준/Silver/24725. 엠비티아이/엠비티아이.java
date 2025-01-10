import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans = 0;
		char[][] board = new char[N][M], mbti = new char[][] { { 'E', 'I' }, { 'N', 'S' }, { 'F', 'T' }, { 'P', 'J' } };
		for (int i = 0; i < N; i++)
			board[i] = br.readLine().toCharArray();
		HashSet<String> mbtis = new HashSet<>();
		String m;
		int[] idx = new int[4];
		for (int a = 0; a <= 1; a++) {
			idx[0] = a;
			for (int b = 0; b <= 1; b++) {
				idx[1] = b;
				for (int c = 0; c <= 1; c++) {
					idx[2] = c;
					for (int d = 0; d <= 1; d++) {
						idx[3] = d;
						m = "";
						for (int i = 0; i <= 3; i++)
							m += mbti[i][idx[i]];
						mbtis.add(m);
						m = "";
						for (int i = 3; i >= 0; i--)
							m += mbti[i][idx[i]];
						mbtis.add(m);
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (j <= M - 4) {
					m = "";
					for (int k = 0; k <= 3; k++)
						m += board[i][j + k];
					if (mbtis.contains(m))
						++ans;
				}
				if (i <= N - 4) {
					m = "";
					for (int k = 0; k <= 3; k++)
						m += board[i + k][j];
					if (mbtis.contains(m))
						++ans;
				}
				if (i <= N - 4 && j <= M - 4) {
					m = "";
					for (int k = 0; k <= 3; k++)
						m += board[i + k][j + k];
					if (mbtis.contains(m))
						++ans;
				}
				if (i <= N - 4 && j >= 3) {
					m = "";
					for (int k = 0; k <= 3; k++)
						m += board[i + k][j - k];
					if (mbtis.contains(m))
						++ans;
				}
			}
		}
		System.out.println(ans);
	}
}