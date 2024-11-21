import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static int[][] board = new int[5][5];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		System.out.println(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}

	static int bfs(int startR, int startC) {
		int[][] dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(startR, startC, 0));
		board[startR][startC] = -1;
		int dr, dc;
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			for (int i = 0; i < 4; i++) {
				dr = node.row + dt[0][i];
				dc = node.col + dt[1][i];
				if (dr < 0 || dr > 4 || dc < 0 || dc > 4 || board[dr][dc] == -1)
					continue;
				if (board[dr][dc] == 1)
					return node.movement + 1;
				queue.add(new Node(dr, dc, node.movement + 1));
				board[dr][dc] = -1;
			}
		}
		return -1;
	}

	static class Node {
		int row, col, movement;

		public Node(int row, int col, int movement) {
			this.row = row;
			this.col = col;
			this.movement = movement;
		}
	}
}