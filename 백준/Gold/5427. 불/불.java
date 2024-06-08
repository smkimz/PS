import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Point {
	int row, col;

	public Point(int row, int col) {
		this.row = row;
		this.col = col;
	}
}

public class Main {
	static char[][] map;
	static int N, M;
	static Deque<Point>[] fire;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), startR = -1, startC = -1;
		StringTokenizer st;
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			map = new char[N][M];
			fire = new ArrayDeque[2];
			for (int i = 0; i <= 1; i++)
				fire[i] = new ArrayDeque<Point>();
			for (int i = 0; i < N; i++) {
				map[i] = br.readLine().toCharArray();
				for (int j = 0; j < M; j++) {
					if (map[i][j] == '*')
						fire[0].add(new Point(i, j));
					else if (map[i][j] == '@') {
						startR = i;
						startC = j;
						map[i][j] = '.';
					}
				}
			}
			searchMap(startR, startC);
		}
		System.out.print(sb);
	}

	public static void searchMap(int startR, int startC) {
		Deque<Point>[] dq = new ArrayDeque[2];
		for (int i = 0; i <= 1; i++)
			dq[i] = new ArrayDeque<>();
		dq[0].add(new Point(startR, startC));
		boolean[][] vt = new boolean[N][M];
		vt[startR][startC] = true;
		Point p;
		int time = 0, dr, dc;
		int[] index = new int[2];
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		while (true) {
			index[0] = time % 2;
			index[1] = (time + 1) % 2;
			if (dq[index[0]].isEmpty())
				break;
			while (!fire[index[0]].isEmpty()) {
				p = fire[index[0]].poll();
				for (int i = 0; i <= 3; i++) {
					dr = p.row + dt[0][i];
					dc = p.col + dt[1][i];
					if (isEscapable(dr, dc) || map[dr][dc] != '.')
						continue;
					map[dr][dc] = '*';
					fire[index[1]].add(new Point(dr, dc));
				}
			}
			while (!dq[index[0]].isEmpty()) {
				p = dq[index[0]].poll();
				for (int i = 0; i <= 3; i++) {
					dr = p.row + dt[0][i];
					dc = p.col + dt[1][i];
					if (isEscapable(dr, dc)) {
						sb.append(time + 1).append("\n");
						return;
					}
					if (!vt[dr][dc] && map[dr][dc] == '.') {
						dq[index[1]].add(new Point(dr, dc));
						vt[dr][dc] = true;
					}
				}
			}
			time++;
		}
		sb.append("IMPOSSIBLE").append("\n");
	}

	public static boolean isEscapable(int dr, int dc) {
		return dr < 0 || dr > N - 1 || dc < 0 || dc > M - 1;
	}
}