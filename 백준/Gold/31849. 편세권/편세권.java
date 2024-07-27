import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static final int INF = Integer.MAX_VALUE;

	static class Point {
		int row, col, dist;

		public Point(int row, int col, int dist) {
			this.row = row;
			this.col = col;
			this.dist = dist;
		}
	}

	static int N, M, R;
	static int[][] map, cost;
	static boolean[][] vt;
	static Deque<Point> dq = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		vt = new boolean[N][M];
		cost = new int[2][R + 1];
		Arrays.fill(cost[1], INF);
		int row, col;
		for (int i = 1; i <= R; i++) {
			st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken()) - 1;
			col = Integer.parseInt(st.nextToken()) - 1;
			map[row][col] = i;
			cost[0][i] = Integer.parseInt(st.nextToken());
		}
		while (--C >= 0) {
			st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken()) - 1;
			col = Integer.parseInt(st.nextToken()) - 1;
			dq.add(new Point(row, col, 0));
			vt[row][col] = true;
		}
		System.out.println(checkMap());
	}

	static int checkMap() {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr, dc, num, ans = INF;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			for (int i = 0; i <= 3; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1 || vt[dr][dc])
					continue;
				vt[dr][dc] = true;
				num = map[dr][dc];
				if (num > 0 && cost[1][num] == INF)
					cost[1][map[dr][dc]] = cost[0][map[dr][dc]] * (p.dist + 1);
				dq.add(new Point(dr, dc, p.dist + 1));
			}
		}
		for (int i = 1; i <= R; i++)
			ans = Math.min(ans, cost[1][i]);
		return ans;
	}
}