import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken()), T = (N / K) * (M / K), maxCount, ans = 0;
		char maxTile;
		char[][] tiles = new char[N][M], resultTiles = new char[K][K];
		int[] count = new int[26];
		for (int i = 0; i < N; i++)
			tiles[i] = br.readLine().toCharArray();
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				count = new int[26];
				for (int x = i; x < N; x += K) {
					for (int y = j; y < M; y += K)
						++count[tiles[x][y] - 'A'];
				}
				maxTile = 0;
				maxCount = 0;
				for (int x = 0; x < 26; x++) {
					if (count[x] < maxCount)
						continue;
					maxCount = count[x];
					maxTile = (char) (x + 'A');
				}
				ans += T - maxCount;
				resultTiles[i][j] = maxTile;
			}
		}
		sb.append(ans).append("\n");
		for (int i = 0; i < N; i++) {
			T = i % K;
			for (int j = 0; j < M; j++)
				sb.append(resultTiles[T][j % K]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}