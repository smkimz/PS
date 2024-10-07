import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static ArrayList<Node>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int problem = 0, dr, dc, d;
		int[][] cave, dt = new int[][] { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
		while (true) {
			++problem;
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			cave = new int[N][N];
			adjList = new ArrayList[N * N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					cave[i][j] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N * N; i++) {
				adjList[i] = new ArrayList<>();
				for (int j = 0; j < 4; j++) {
					dr = (i / N) + dt[0][j];
					dc = (i % N) + dt[1][j];
					d = N * dr + dc;
					if (dr >= 0 && dr < N && dc >= 0 && dc < N)
						adjList[i].add(new Node(d, cave[dr][dc]));
				}
			}
			sb.append("Problem ").append(problem).append(": ").append(dijkstra(cave[0][0])).append("\n");
		}
		System.out.print(sb);
	}

	static int dijkstra(int start) {
		boolean[] visited = new boolean[N * N];
		int[] distance = new int[N * N];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0] = start;
		PriorityQueue<Node> pqueue = new PriorityQueue<>();
		pqueue.add(new Node(0, start));
		Node node;
		while (!pqueue.isEmpty()) {
			node = pqueue.poll();
			if (visited[node.end])
				continue;
			visited[node.end] = true;
			for (Node n : adjList[node.end]) {
				if (distance[n.end] > distance[node.end] + n.cost) {
					distance[n.end] = distance[node.end] + n.cost;
					pqueue.add(new Node(n.end, distance[n.end]));
				}
			}
		}
		return distance[(N * N) - 1];
	}

	static class Node implements Comparable<Node> {
		int end, cost;

		public Node(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
}
