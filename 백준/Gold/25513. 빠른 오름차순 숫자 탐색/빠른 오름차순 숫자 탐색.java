import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static int[][] board;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		board = new int[5][5];
		int sr, sc;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		sr = Integer.parseInt(st.nextToken());
		sc = Integer.parseInt(st.nextToken());
		bfs(sr, sc);
	}

	static void bfs(int sr, int sc) {
		boolean[][][] vt = new boolean[7][5][5];
		vt[0][sr][sc] = true;
		ArrayDeque<Node> dq = new ArrayDeque<>();
		dq.add(new Node(sr, sc, 0, 0));
		int[][] dt = new int[][] { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		int dr, dc, x;
		Node node;
		while (!dq.isEmpty()) {
			node = dq.poll();
			if (board[node.r][node.c] == 6 && node.x == 6) {
				System.out.println(node.m);
				return;
			}
			for (int i = 0; i < 4; i++) {
				dr = node.r + dt[0][i];
				dc = node.c + dt[1][i];
				if (dr < 0 || dr >= 5 || dc < 0 || dc >= 5 || vt[node.x][dr][dc] || board[dr][dc] == -1)
					continue;
				if (board[dr][dc] - node.x == 1)
					x = node.x + 1;
				else
					x = node.x;
				dq.add(new Node(dr, dc, node.m + 1, x));
				vt[x][dr][dc] = true;
			}
		}
		System.out.println(-1);
	}

	static class Node {
		int r, c, m, x;

		public Node(int r, int c, int m, int x) {
			this.r = r;
			this.c = c;
			this.m = m;
			this.x = x;
		}
	}
}