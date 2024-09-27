import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge> {
		int x, cost;

		public Edge(int x, int cost) {
			this.x = x;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}
	}

	static final int MAX = Integer.MAX_VALUE;
	static int N;
	static char[][] parts;
	static ArrayList<Edge>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		adjList = new ArrayList[N];
		for (int i = 0; i < N; i++)
			adjList[i] = new ArrayList<>();
		parts = new char[N][];
		parts[0] = br.readLine().toCharArray();
		int len = parts[0].length, cost;
		for (int i = 1; i < N; i++) {
			parts[i] = br.readLine().toCharArray();
			for (int j = i - 1; j >= 0; j--) {
				cost = 0;
				for (int k = 0; k < len; k++)
					cost += Math.pow(parts[i][k] - parts[j][k], 2);
				adjList[j].add(new Edge(i, cost));
				adjList[i].add(new Edge(j, cost));
			}
		}
		st = new StringTokenizer(br.readLine());
		dijkstra(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
	}

	static void dijkstra(int start, int end) {
		boolean[] visited = new boolean[N];
		int[] dist = new int[N];
		Arrays.fill(dist, MAX);
		dist[start] = 0;
		PriorityQueue<Edge> pqueue = new PriorityQueue<Main.Edge>();
		pqueue.add(new Edge(start, 0));
		Edge edge;
		while (!pqueue.isEmpty()) {
			edge = pqueue.poll();
			if (visited[edge.x])
				continue;
			visited[edge.x] = true;
			for (Edge e : adjList[edge.x]) {
				if (dist[e.x] <= dist[edge.x] + e.cost)
					continue;
				dist[e.x] = dist[edge.x] + e.cost;
				pqueue.add(new Edge(e.x, dist[e.x]));
			}
		}
		System.out.println(dist[end]);
	}
}