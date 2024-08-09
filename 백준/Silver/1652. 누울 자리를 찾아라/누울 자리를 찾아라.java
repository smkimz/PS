import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, horizontal = 0, vertical = 0;
		char[][] map = new char[N][N];
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 'X') {
					if (count >= 2)
						++horizontal;
					count = 0;
					continue;
				}
				++count;
			}
			if (count >= 2)
				++horizontal;
			count = 0;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[j][i] == 'X') {
					if (count >= 2)
						++vertical;
					count = 0;
					continue;
				}
				++count;
			}
			if (count >= 2)
				++vertical;
			count = 0;
		}
		System.out.printf("%d %d", horizontal, vertical);
	}
}