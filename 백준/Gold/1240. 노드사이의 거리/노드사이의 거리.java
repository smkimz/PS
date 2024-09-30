import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[] visited;
	static ArrayList<Node>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), x, y, dist;
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			dist = Integer.parseInt(st.nextToken());
			adjList[x].add(new Node(y, dist));
			adjList[y].add(new Node(x, dist));
		}
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}

	static int bfs(int start, int end) {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(start, 0));
		boolean[] visited = new boolean[N + 1];
		visited[start] = true;
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.p == end)
				return node.dist;
			for (Node n : adjList[node.p]) {
				if (visited[n.p])
					continue;
				visited[n.p] = true;
				queue.add(new Node(n.p, node.dist + n.dist));
			}
		}
		return -1;
	}

	static class Node {
		int p, dist;

		public Node(int p, int dist) {
			this.p = p;
			this.dist = dist;
		}
	}
}