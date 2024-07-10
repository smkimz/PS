import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge> {
		int end, dist;

		public Edge(int end, int dist) {
			this.end = end;
			this.dist = dist;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.dist, o.dist);
		}
	}

	static int N, V;
	static int[] house;
	static List<Edge>[] adjList;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken()), X, Y, D, ans = 0;
		int[] start = new int[2];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= 1; i++)
			start[i] = Integer.parseInt(st.nextToken());
		house = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			house[i] = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++)
			adjList[i] = new ArrayList<>();
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			D = Integer.parseInt(st.nextToken());
			adjList[X].add(new Edge(Y, D));
			adjList[Y].add(new Edge(X, D));
		}
		for (int i = 0; i <= 1; i++)
			ans += calcDistance(start[i]);
		System.out.println(ans);
	}

	static int calcDistance(int start) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(start, 0));
		boolean[] vt = new boolean[V + 1];
		int[] dist = new int[V + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		Edge edge;
		while (!pq.isEmpty()) {
			edge = pq.poll();
			if (vt[edge.end])
				continue;
			vt[edge.end] = true;
			for (Edge e : adjList[edge.end]) {
				if (dist[e.end] <= dist[edge.end] + e.dist)
					continue;
				dist[e.end] = dist[edge.end] + e.dist;
				pq.add(new Edge(e.end, dist[e.end]));
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++)
			sum += dist[house[i]] == Integer.MAX_VALUE ? -1 : dist[house[i]];
		return sum;
	}
}