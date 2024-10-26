import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static PriorityQueue<Integer>[] adjList;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				R = Integer.parseInt(st.nextToken()), u, v;
		visited = new int[N + 1];
		Arrays.fill(visited, -1);
		adjList = new PriorityQueue[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new PriorityQueue<>(Collections.reverseOrder());
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			adjList[u].add(v);
			adjList[v].add(u);
		}
		dfs(R, 0);
		for (int i = 1; i <= N; i++)
			sb.append(visited[i]).append("\n");
		System.out.print(sb);
	}

	private static void dfs(int idx, int depth) {
		if (visited[idx] != -1)
			return;
		visited[idx] = depth;
		while (!adjList[idx].isEmpty())
			dfs(adjList[idx].poll(), depth + 1);
	}
}