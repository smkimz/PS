import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final int INF = Integer.MAX_VALUE;

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

	static List<Edge>[] adjList;
	static int N;
	static int[] totalDist;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), M, K, a, b, c, ans = 0, min, sum;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			adjList = new ArrayList[N + 1];
			for (int i = 1; i <= N; i++)
				adjList[i] = new ArrayList<Edge>();
			while (--M >= 0) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
				adjList[a].add(new Edge(b, c));
				adjList[b].add(new Edge(a, c));
			}
			K = Integer.parseInt(br.readLine());
			totalDist = new int[N + 1];
			st = new StringTokenizer(br.readLine());
			while (--K >= 0)
				checkDistance(Integer.parseInt(st.nextToken()));
			min = INF;
			for (int i = 1; i <= N; i++) {
				if (totalDist[i] >= min)
					continue;
				min = totalDist[i];
				ans = i;
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}

	static void checkDistance(int start) {
		boolean[] vt = new boolean[N + 1];
		int[] dist = new int[N + 1];
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(start, 0));
		Arrays.fill(dist, INF);
		dist[start] = 0;
		Edge edge;
		while (!pq.isEmpty()) {
			edge = pq.poll();
			if (vt[edge.end])
				continue;
			vt[edge.end] = true;
			for (Edge e : adjList[edge.end]) {
				if (dist[e.end] <= e.dist + dist[edge.end])
					continue;
				dist[e.end] = e.dist + dist[edge.end];
				pq.add(new Edge(e.end, dist[e.end]));
			}
		}
		for (int i = 1; i <= N; i++)
			totalDist[i] += dist[i];
	}
}