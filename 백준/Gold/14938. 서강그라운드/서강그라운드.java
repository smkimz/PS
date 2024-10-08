import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, R, ans;
	static int[] item, distance;
	static boolean[] visited;

	static class Map implements Comparable<Map> {
		int area, dist;

		public Map(int area, int dist) {
			this.area = area;
			this.dist = dist;
		}

		@Override
		public int compareTo(Map o) {
			return Integer.compare(this.dist, o.dist);
		}
	}

	static List<Map>[] adjList;
	static PriorityQueue<Map> pqueue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		item = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			item[i] = Integer.parseInt(st.nextToken());

		adjList = new ArrayList[N];
		for (int i = 0; i < N; i++)
			adjList[i] = new ArrayList<>();

		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int dist = Integer.parseInt(st.nextToken());
			adjList[start].add(new Map(end, dist));
			adjList[end].add(new Map(start, dist));
		}
		ans = 0;
		for (int i = 0; i < N; i++)
			dijkstra(i);

		System.out.println(ans);
	}

	private static void dijkstra(int startArea) {
		pqueue = new PriorityQueue<>();
		pqueue.add(new Map(startArea, 0));

		distance = new int[N];
		Arrays.fill(distance, 10000);
		distance[startArea] = 0;

		visited = new boolean[N];

		while (!pqueue.isEmpty()) {
			Map map = pqueue.poll();

			if (visited[map.area])
				continue;
			visited[map.area] = true;

			for (Map m : adjList[map.area]) {
				if (distance[m.area] > distance[map.area] + m.dist) {
					distance[m.area] = distance[map.area] + m.dist;
					pqueue.add(new Map(m.area, distance[m.area]));
				}
			}
		}

		int totalItem = 0;
		for (int i = 0; i < N; i++) {
			if (distance[i] <= M)
				totalItem += item[i];
		}
		ans = Math.max(ans, totalItem);
	}
}