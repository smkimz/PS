import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int H, W, O, F, XS, YS, XE, YE;
	static int[][] maze;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), X, Y, L;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			O = Integer.parseInt(st.nextToken());
			F = Integer.parseInt(st.nextToken());
			XS = Integer.parseInt(st.nextToken());
			YS = Integer.parseInt(st.nextToken());
			XE = Integer.parseInt(st.nextToken());
			YE = Integer.parseInt(st.nextToken());
			maze = new int[H + 1][W + 1];
			while (--O >= 0) {
				st = new StringTokenizer(br.readLine());
				X = Integer.parseInt(st.nextToken());
				Y = Integer.parseInt(st.nextToken());
				L = Integer.parseInt(st.nextToken());
				maze[X][Y] = L;
			}
			if (exploreMaze())
				sb.append("잘했어!!");
			else
				sb.append("인성 문제있어??");
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static boolean exploreMaze() {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(XS, YS, F));
		int[][] visited = new int[H + 1][W + 1];
		for (int i = 0; i <= H; i++)
			Arrays.fill(visited[i], -1);
		visited[XS][YS] = F;
		int[][] dt = new int[][] { { 1, 0, -1, 0 }, { 0, 1, 0, -1 } };
		int dx, dy;
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.x == XE && node.y == YE)
				return true;
			if (node.force <= 0)
				continue;
			for (int i = 0; i < 4; i++) {
				dx = node.x + dt[0][i];
				dy = node.y + dt[1][i];
				if (!checkNodeCondition(dx, dy))
					continue;
				if (!checkMovementCondition(node.force, visited[dx][dy], maze[dx][dy] - maze[node.x][node.y]))
					continue;
				queue.add(new Node(dx, dy, node.force - 1));
				visited[dx][dy] = node.force - 1;
			}
		}
		return false;
	}

	static boolean checkNodeCondition(int dx, int dy) {
		return dx >= 1 && dx <= H && dy >= 1 && dy <= W;
	}

	static boolean checkMovementCondition(int f, int v, int h) {
		return f - 1 > v && f >= h;
	}

	static class Node {
		int x, y, force;

		public Node(int x, int y, int force) {
			this.x = x;
			this.y = y;
			this.force = force;
		}
	}
}