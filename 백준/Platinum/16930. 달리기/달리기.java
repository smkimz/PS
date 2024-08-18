import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, time;

		public Point(int row, int col, int time) {
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int N, M, K;
	static int[] end = new int[2];
	static char[][] map;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		for (int i = 0; i < N; i++)
			map[i] = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		int startR = Integer.parseInt(st.nextToken()) - 1, startC = Integer.parseInt(st.nextToken()) - 1;
		for (int i = 0; i < 2; i++)
			end[i] = Integer.parseInt(st.nextToken()) - 1;
		exploreMap(startR, startC);
	}

	static void exploreMap(int startR, int startC) {
		int[][] vt = new int[N][M], dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		for (int i = 0; i < N; i++)
			Arrays.fill(vt[i], INF);
		vt[startR][startC] = 0;
		Deque<Point> dq = new ArrayDeque<>();
		dq.add(new Point(startR, startC, 0));
		int dr, dc;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (p.row == end[0] && p.col == end[1]) {
				System.out.println(p.time);
				return;
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= K; j++) {
					dr = p.row + dt[0][i] * j;
					dc = p.col + dt[1][i] * j;
					if (!checkMove(dr, dc) || p.time + 1 > vt[dr][dc])
						break;
					if (vt[dr][dc] != INF)
						continue;
					dq.add(new Point(dr, dc, p.time + 1));
					vt[dr][dc] = p.time + 1;
				}
			}
		}
		System.out.println(-1);
	}

	static boolean checkMove(int dr, int dc) {
		return dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && map[dr][dc] == '.';
	}
}