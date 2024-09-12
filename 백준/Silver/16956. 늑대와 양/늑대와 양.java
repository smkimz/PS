import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static class Sheep {
		int row, col;

		public Sheep(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int R, C;
	static char[][] map;
	static ArrayDeque<Sheep> dq = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 'S')
					dq.add(new Sheep(i, j));
			}
		}
		checkMap();
	}

	static void checkMap() {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr, dc;
		char c;
		Sheep s;
		while (!dq.isEmpty()) {
			s = dq.poll();
			for (int i = 0; i < 4; i++) {
				dr = s.row + dt[0][i];
				dc = s.col + dt[1][i];
				if (dr < 0 || dr > R - 1 || dc < 0 || dc > C - 1)
					continue;
				c = map[dr][dc];
				if (c == 'S' || c == 'D')
					continue;
				if (c == 'W') {
					System.out.println(0);
					return;
				}
				map[dr][dc] = 'D';
			}
		}
		print();
	}

	static void print() {
		StringBuilder sb = new StringBuilder();
		sb.append(1).append("\n");
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				sb.append(map[i][j]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}