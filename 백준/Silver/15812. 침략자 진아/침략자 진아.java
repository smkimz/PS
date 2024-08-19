import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col;

		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), V = 0;
		char[][] map = new char[N][M];
		List<Point> villages = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if (map[i][j] == '0')
					continue;
				villages.add(new Point(i, j));
				++V;
			}
		}

		int NM = N * M, distX, distY, max, ans = Integer.MAX_VALUE;
		int[][] start = new int[2][2];
		Point v;
		for (int x = 0; x < NM - 1; x++) {
			start[0][0] = x / M;
			start[0][1] = x % M;
			if (map[start[0][0]][start[0][1]] == '1')
				continue;
			p: for (int y = x + 1; y < NM; y++) {
				start[1][0] = y / M;
				start[1][1] = y % M;
				max = 0;
				if (map[start[1][0]][start[1][1]] == '1')
					continue;
				for (int i = 0; i < V; i++) {
					v = villages.get(i);
					distX = Math.abs(start[0][0] - v.row) + Math.abs(start[0][1] - v.col);
					distY = Math.abs(start[1][0] - v.row) + Math.abs(start[1][1] - v.col);
					max = Math.max(max, Math.min(distX, distY));
					if (max >= ans)
						continue p;
				}
				ans = Math.min(ans, max);
			}
		}
		System.out.print(ans);
	}
}