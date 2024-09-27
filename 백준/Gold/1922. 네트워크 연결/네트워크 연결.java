import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge> {
		int start, end, cost;

		public Edge(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}
	}

	static int N;
	static PriorityQueue<Edge> pqueue;
	static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		pqueue = new PriorityQueue<>();
		parent = new int[N + 1];
		for (int i = 1; i <= N; i++)
			parent[i] = i;
		int x, y;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			pqueue.add(new Edge(Math.min(x, y), Math.max(x, y), Integer.parseInt(st.nextToken())));
		}
		kruskal();
	}

	static void kruskal() {
		Edge edge;
		int ans = 0, selectedEdgeCount = 0, px, py;
		while (!pqueue.isEmpty() && selectedEdgeCount < N - 1) {
			edge = pqueue.poll();
			px = findSet(edge.start);
			py = findSet(edge.end);
			if (px != py) {
				parent[Math.max(px, py)] = Math.min(px, py);
				ans += edge.cost;
				++selectedEdgeCount;
			}
		}
		System.out.println(ans);
	}

	static int findSet(int x) {
		if (parent[x] != x)
			parent[x] = findSet(parent[x]);
		return parent[x];
	}
}