import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, dist, size;
		int[][] C;
		boolean[] visited;
		boolean isArrived;
		ArrayDeque<Node>[] nodes;
		ArrayDeque<Node> deque;
		Node nodeX, nodeY;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			C = new int[N + 2][2];
			nodes = new ArrayDeque[N + 2];
			visited = new boolean[N + 2];
			for (int i = 0; i <= N + 1; i++) {
				nodes[i] = new ArrayDeque<Node>();
				st = new StringTokenizer(br.readLine());
				C[i][0] = Integer.parseInt(st.nextToken());
				C[i][1] = Integer.parseInt(st.nextToken());
				for (int j = i - 1; j >= 0; j--) {
					dist = Math.abs(C[i][0] - C[j][0]) + Math.abs(C[i][1] - C[j][1]);
					if (dist > 1000)
						continue;
					nodes[i].add(new Node(j, dist));
					nodes[j].add(new Node(i, dist));
				}
			}
			deque = new ArrayDeque<>();
			deque.add(new Node(0, 0));
			visited[0] = true;
			isArrived = false;
			while (!deque.isEmpty()) {
				nodeX = deque.poll();
				if (nodeX.next == N + 1) {
					isArrived = true;
					break;
				}
				size = nodes[nodeX.next].size();
				while (--size >= 0) {
					nodeY = nodes[nodeX.next].poll();
					if (visited[nodeY.next])
						continue;
					deque.add(new Node(nodeY.next, nodeY.dist));
					visited[nodeY.next] = true;
				}
			}
			if (isArrived)
				sb.append("happy");
			else
				sb.append("sad");
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static class Node {
		int next, dist;

		public Node(int next, int dist) {
			this.next = next;
			this.dist = dist;
		}
	}
}