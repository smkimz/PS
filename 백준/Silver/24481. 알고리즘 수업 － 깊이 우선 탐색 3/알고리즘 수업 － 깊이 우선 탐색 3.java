import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N, M, R;
	static int[] depth;
	static boolean[] vt;
	static List<Integer>[] adjList;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		vt = new boolean[N + 1];
		depth = new int[N + 1];
		Arrays.fill(depth, -1);
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<Integer>();
		int x, y;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			adjList[x].add(y);
			adjList[y].add(x);
		}
		for (int i = 1; i <= N; i++)
			Collections.sort(adjList[i]);
		dfs(R, 0);
		for (int i = 1; i <= N; i++)
			sb.append(depth[i]).append("\n");
		System.out.print(sb);
	}

	static void dfs(int v, int d) {
		if (vt[v])
			return;
		vt[v] = true;
		depth[v] = d;
		int next;
		for (int i = 0; i < adjList[v].size(); i++) {
			next = adjList[v].get(i);
			if (vt[next])
				continue;
			dfs(next, d + 1);
		}
	}
}