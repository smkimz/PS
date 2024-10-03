import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()),
				D = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		System.out.println(movingCleaner(R, C, D));
	}

	private static int movingCleaner(int sRow, int sCol, int sDir) {
		int[][] dt = new int[][] { { -1, 0, 1, 0 }, { 0, 1, 0, -1 } };
		int row = sRow, col = sCol, dir = sDir, nRow, nCol, nDir, ans = 0;
		boolean findDirtyPlace;
		while (true) {
			if (map[row][col] == 0) {
				map[row][col] = -1;
				ans++;
			}

			findDirtyPlace = false;
			for (int i = 1; i <= 4; i++) {
				nDir = (dir + 4 - i) % 4;
				nRow = row + dt[0][nDir];
				nCol = col + dt[1][nDir];
				if (!isMovable(nRow, nCol) || map[nRow][nCol] != 0)
					continue;
				row = nRow;
				col = nCol;
				dir = nDir;
				findDirtyPlace = true;
				break;
			}
			if (findDirtyPlace)
				continue;

			if (isMovable(row + dt[0][(dir + 2) % 4], col + dt[1][(dir + 2) % 4])) {
				row += dt[0][(dir + 2) % 4];
				col += dt[1][(dir + 2) % 4];
				continue;
			}
			break;
		}
		return ans;
	}

	private static boolean isMovable(int row, int col) {
		return row >= 0 && row <= N - 1 && col >= 0 && col <= M - 1 && map[row][col] != 1;
	}
}