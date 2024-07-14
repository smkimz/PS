import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<Integer>[] adjList;
	static int seq = 1;
	static int[] vt;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, M, R, u, v;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		vt = new int[N + 1];
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			adjList[u].add(v);
			adjList[v].add(u);
		}
		for (int i = 1; i <= N; i++)
			Collections.sort(adjList[i]);
		dfs(R);
		for (int i = 1; i <= N; i++)
			sb.append(vt[i]).append("\n");
		System.out.print(sb);
	}

	static void dfs(int v) {
		if (vt[v] != 0)
			return;
		vt[v] = seq++;
		for (int i = 0; i < adjList[v].size(); i++)
			dfs(adjList[v].get(i));
	}
}