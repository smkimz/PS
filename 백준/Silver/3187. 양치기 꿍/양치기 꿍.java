import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int row, col;

		public Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int R, C, W = 0, S = 0;
	static char[][] map;
	static int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == '#')
					continue;
				checkMap(i, j);
			}
		}

		System.out.printf("%d %d", S, W);
	}

	static void checkMap(int startRow, int startCol) {
		int dr, dc, wolf = 0, sheep = 0;
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(startRow, startCol));
		if (map[startRow][startCol] == 'v')
			++wolf;
		else if (map[startRow][startCol] == 'k')
			++sheep;
		map[startRow][startCol] = '#';
		Node n;
		while (!queue.isEmpty()) {
			n = queue.poll();
			for (int i = 0; i < 4; i++) {
				dr = n.row + dt[0][i];
				dc = n.col + dt[1][i];
				if (!isMovable(dr, dc))
					continue;
				if (map[dr][dc] == 'v')
					++wolf;
				else if (map[dr][dc] == 'k')
					++sheep;
				map[dr][dc] = '#';
				queue.add(new Node(dr, dc));
			}
		}

		if (wolf >= sheep)
			W += wolf;
		else
			S += sheep;
	}

	static boolean isMovable(int dr, int dc) {
		return dr >= 0 && dr <= R - 1 && dc >= 0 && dc <= C - 1 && map[dr][dc] != '#';
	}
}