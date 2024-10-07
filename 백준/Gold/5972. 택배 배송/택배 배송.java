import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static final int INF = Integer.MAX_VALUE;
	static int N;
	static ArrayList<Edge>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), x, y, cost;
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			cost = Integer.parseInt(st.nextToken());
			adjList[x].add(new Edge(y, cost));
			adjList[y].add(new Edge(x, cost));
		}
		dijkstra();
	}

	private static void dijkstra() {
		PriorityQueue<Edge> pqueue = new PriorityQueue<>();
		pqueue.add(new Edge(1, 0));
		boolean[] visited = new boolean[N + 1];
		int[] cost = new int[N + 1];
		Arrays.fill(cost, INF);
		cost[1] = 0;
		Edge edge;
		while (!pqueue.isEmpty()) {
			edge = pqueue.poll();
			if (visited[edge.end])
				continue;
			visited[edge.end] = true;
			for (Edge e : adjList[edge.end]) {
				if (cost[e.end] > cost[edge.end] + e.cost) {
					cost[e.end] = cost[edge.end] + e.cost;
					pqueue.add(new Edge(e.end, cost[e.end]));
				}
			}
		}
		System.out.println(cost[N]);
	}

	static class Edge implements Comparable<Edge> {
		int end, cost;

		public Edge(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
}