import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] items;
	static ArrayList<Node>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()), a, b, l, ans = 0;
		items = new int[N + 1];
		adjList = new ArrayList[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			items[i] = Integer.parseInt(st.nextToken());
			adjList[i] = new ArrayList<>();
		}
		while (--R >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			adjList[a].add(new Node(b, l));
			adjList[b].add(new Node(a, l));
		}
		for (int i = 1; i <= N; i++)
			ans = Math.max(ans, dijkstra(i));
		System.out.println(ans);
	}

	static int dijkstra(int start) {
		PriorityQueue<Node> pqueue = new PriorityQueue<>();
		pqueue.add(new Node(start, 0));
		int[] distances = new int[N + 1];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[start] = 0;
		boolean[] visited = new boolean[N + 1];
		Node node;
		while (!pqueue.isEmpty()) {
			node = pqueue.poll();
			if (visited[node.area])
				continue;
			visited[node.area] = true;
			for (Node n : adjList[node.area]) {
				if (distances[n.area] <= distances[node.area] + n.dist)
					continue;
				distances[n.area] = distances[node.area] + n.dist;
				pqueue.add(new Node(n.area, distances[n.area]));
			}
		}
		int totalItem = 0;
		for (int i = 1; i <= N; i++) {
			if (distances[i] > M)
				continue;
			totalItem += items[i];
		}
		return totalItem;
	}

	static class Node implements Comparable<Node> {
		int area, dist;

		public Node(int area, int dist) {
			this.area = area;
			this.dist = dist;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.dist, o.dist);
		}
	}
}