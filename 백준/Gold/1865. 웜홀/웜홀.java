import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static final int INF = 1000000000;
	static int N;
	static ArrayList<Node>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int TC = Integer.parseInt(br.readLine());
		for (int t = 0; t < TC; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()), x, y, time;
			adjList = new ArrayList[N + 1];
			for (int i = 1; i <= N; i++)
				adjList[i] = new ArrayList<>();
			for (int i = 0; i < M + W; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				time = Integer.parseInt(st.nextToken());
				if (i >= M)
					adjList[x].add(new Node(y, -time));
				else {
					adjList[x].add(new Node(y, time));
					adjList[y].add(new Node(x, time));
				}
			}
			sb.append(bellmanFord() ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}

	static boolean bellmanFord() {
		int[] timeArr = new int[N + 1];
		int end, time;
		for (int r = 0; r < N - 1; r++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 0; j < adjList[i].size(); j++) {
					end = adjList[i].get(j).end;
					time = adjList[i].get(j).time;
					if (timeArr[end] > timeArr[i] + time)
						timeArr[end] = timeArr[i] + time;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < adjList[i].size(); j++) {
				end = adjList[i].get(j).end;
				time = adjList[i].get(j).time;
				if (timeArr[end] > timeArr[i] + time)
					return true;
			}
		}
		return false;
	}

	static class Node implements Comparable<Node> {
		int end, time;

		public Node(int end, int time) {
			this.end = end;
			this.time = time;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.time, o.time);
		}
	}
}