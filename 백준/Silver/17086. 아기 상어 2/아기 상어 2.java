import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, dist, num;

		public Point(int row, int col, int dist, int num) {
			this.row = row;
			this.col = col;
			this.dist = dist;
			this.num = num;
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int N, M, B = 0;
	static int[] safeDistance;
	static boolean[][] map;
	static boolean[][][] vt;
	static Deque<Point> dq = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		Deque<Point> temp = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = st.nextToken().equals("0") ? false : true;
				if (map[i][j])
					continue;
				temp.add(new Point(i, j, 0, B));
				++B;
			}
		}

		vt = new boolean[B][N][M];
		Point p;
		while (!temp.isEmpty()) {
			p = temp.poll();
			dq.add(p);
			vt[p.num][p.row][p.col] = true;
		}

		safeDistance = new int[B];
		Arrays.fill(safeDistance, INF);
		checkMap();

		int max = -1;
		for (int i = 0; i < B; i++)
			max = Math.max(max, safeDistance[i]);
		System.out.println(max);
	}

	static void checkMap() {
		int[][] dt = { { -1, 0, 1, 1, 1, 0, -1, -1 }, { 1, 1, 1, 0, -1, -1, -1, 0 } };
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (safeDistance[p.num] != INF)
				continue;
			for (int i = 0; i <= 7; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (isImmovable(dr, dc, p.num))
					continue;
				if (map[dr][dc]) {
					safeDistance[p.num] = p.dist + 1;
					continue;
				}
				dq.add(new Point(dr, dc, p.dist + 1, p.num));
				vt[p.num][dr][dc] = true;
			}
		}
	}

	static boolean isImmovable(int r, int c, int n) {
		return r < 0 || r > N - 1 || c < 0 || c > M - 1 || vt[n][r][c];
	}
}