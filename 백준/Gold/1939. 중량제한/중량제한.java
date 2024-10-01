import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static PriorityQueue<Node> pqueue = new PriorityQueue<>();
	static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		parent = new int[N + 1];
		for (int i = 1; i <= N; i++)
			parent[i] = i;
		int x, y, w;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			pqueue.add(new Node(Math.min(x, y), Math.max(x, y), w));
		}
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		checkRoads(Math.min(x, y), Math.max(x, y));
	}

	static void checkRoads(int start, int end) {
		int px, py, min = Integer.MAX_VALUE;
		Node n;
		while (!pqueue.isEmpty()) {
			n = pqueue.poll();
			px = findParent(n.x);
			py = findParent(n.y);
			if (px == py)
				continue;
			parent[Math.max(px, py)] = Math.min(px, py);
			min = Math.min(min, n.weight);
			if (findParent(start) == findParent(end))
				break;
		}
		System.out.println(min);
	}

	static int findParent(int x) {
		if (x != parent[x])
			parent[x] = findParent(parent[x]);
		return parent[x];
	}

	static class Node implements Comparable<Node> {
		int x, y, weight;

		public Node(int x, int y, int weight) {
			this.x = x;
			this.y = y;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(o.weight, this.weight);
		}
	}
}