import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int N, K;

	static class Node {
		int num, dist;

		public Node(int num, int dist) {
			this.num = num;
			this.dist = dist;
		}
	}

	static List<Integer>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),
				X = Integer.parseInt(st.nextToken()), x, y;
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			adjList[x].add(y);
		}
		checkCities(X, K);
	}

	static void checkCities(int start, int dist) {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(start, 0));
		boolean[] visited = new boolean[N + 1];
		visited[start] = true;
		PriorityQueue<Integer> ans = new PriorityQueue<>();
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.dist >= dist) {
				if (node.dist > dist)
					break;
				ans.add(node.num);
			}
			for (int n : adjList[node.num]) {
				if (visited[n])
					continue;
				queue.add(new Node(n, node.dist + 1));
				visited[n] = true;
			}
		}

		if (ans.isEmpty())
			sb.append(-1);
		else {
			while (!ans.isEmpty())
				sb.append(ans.poll()).append("\n");
		}
		System.out.print(sb);
	}
}