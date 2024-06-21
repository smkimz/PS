import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int row, col, pow;

		public Point(int row, int col, int pow) {
			this.row = row;
			this.col = col;
			this.pow = pow;
		}
	}

	static int W, H, lamp;
	static char[][] map;
	static Deque<Point> dq;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> redstone = new HashMap<String, Integer>();
		redstone.put("redstone_block", 1);
		redstone.put("redstone_dust", 2);
		redstone.put("redstone_lamp", 3);
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new char[H][W];
		dq = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()), type, row, col;
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			type = redstone.get(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			row = Integer.parseInt(st.nextToken());
			if (type == 1)
				dq.add(new Point(row, col, 16));
			else if (type == 3)
				lamp++;
			map[row][col] = (char) (type + '0');
		}
		searchMap();
	}

	static void searchMap() {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr, dc, cnt = 0;
		Point p;
		while (!dq.isEmpty()) {
			p = dq.poll();
			if (p.pow <= 1)
				continue;
			for (int i = 0; i <= 3; i++) {
				dr = p.row + dt[0][i];
				dc = p.col + dt[1][i];
				if (!isMovable(dr, dc))
					continue;
				if (map[dr][dc] == '2') {
					dq.add(new Point(dr, dc, p.pow - 1));
					map[dr][dc] = '1';
					continue;
				}
				cnt++;
				if (cnt < lamp)
					continue;
				System.out.println("success");
				return;
			}
		}
		System.out.println("failed");
	}

	static boolean isMovable(int dr, int dc) {
		return dr >= 0 && dr <= H - 1 && dc >= 0 && dc <= W - 1 && map[dr][dc] >= '2';
	}
}
