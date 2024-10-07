import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int N;
	static char[][] arr;
	static int[] costArr;
	static boolean[] visited;

	static class Room implements Comparable<Room> {
		int vertex, cost;

		public Room(int vertex, int cost) {
			super();
			this.vertex = vertex;
			this.cost = cost;
		}

		@Override
		public int compareTo(Room o) {
			return this.cost - o.cost;
		}
	}

	static List<Room>[] adjList;
	static PriorityQueue<Room> pqueue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		for (int i = 0; i < N; i++)
			arr[i] = br.readLine().toCharArray();

		adjList = new ArrayList[N * N];
		for (int i = 0; i < N * N; i++)
			adjList[i] = new ArrayList<>();

		int[] dt = { 1, N, -1, -N };
		for (int i = 0; i < N * N; i++) {
			for (int j = 0; j <= 3; j++) {
				int d = i + dt[j];
				if (isMovable(i, j, d)) {
					if (arr[d / N][d % N] == '1')
						adjList[i].add(new Room(d, 0));
					else if (arr[d / N][d % N] == '0')
						adjList[i].add(new Room(d, 1));
				}
			}
		}
		dijkstra();
	}

	private static void dijkstra() {
		pqueue = new PriorityQueue<>();
		pqueue.add(new Room(0, 0));

		costArr = new int[N * N];
		Arrays.fill(costArr, 100000000);
		costArr[0] = 0;

		visited = new boolean[N * N];

		while (!pqueue.isEmpty()) {
			Room room = pqueue.poll();

			if (visited[room.vertex])
				continue;
			visited[room.vertex] = true;

			for (Room r : adjList[room.vertex]) {
				if (costArr[r.vertex] > costArr[room.vertex] + r.cost) {
					costArr[r.vertex] = costArr[room.vertex] + r.cost;
					pqueue.add(new Room(r.vertex, costArr[r.vertex]));
				}
			}
		}
		System.out.println(costArr[(N * N) - 1]);
	}

	public static boolean isMovable(int i, int j, int d) {
		return d >= 0 && d <= (N * N) - 1 && !(i % N == 0 && j == 2) && !(i % N == N - 1 && j == 0);
	}
}