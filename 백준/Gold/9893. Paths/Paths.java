import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge> {
		int end, dist;
		long cost;

		public Edge(int end, int dist, long cost) {
			this.end = end;
			this.dist = dist;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			if (this.dist == o.dist)
				return Long.compare(this.cost, o.cost);
			return Integer.compare(this.dist, o.dist);
		}
	}

	static ArrayList<Edge>[] adjList;
	static int N;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), x, y;
		long cost;
		adjList = new ArrayList[N];
		for (int i = 0; i < N; i++)
			adjList[i] = new ArrayList<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			cost = Long.parseLong(st.nextToken());
			adjList[x].add(new Edge(y, 1, cost));
		}
		calculate();
	}

	static void calculate() {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(0, 0, 0));
		boolean[] vt = new boolean[N];
		int[] dist = new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;
		long[] cost = new long[N];
		Arrays.fill(cost, Long.MAX_VALUE);
		cost[0] = 0;
		Edge edge;
		while (!pq.isEmpty()) {
			edge = pq.poll();
			if (vt[edge.end])
				continue;
			vt[edge.end] = true;
			for (Edge e : adjList[edge.end]) {
				if (dist[e.end] < dist[edge.end] + 1)
					continue;
				else if (dist[e.end] == dist[edge.end] + 1 && cost[e.end] <= cost[edge.end] + e.cost)
					continue;
				dist[e.end] = dist[edge.end] + 1;
				cost[e.end] = cost[edge.end] + e.cost;
				pq.add(new Edge(e.end, dist[e.end], cost[e.end]));
			}
		}
		System.out.println(cost[1]);
	}
}