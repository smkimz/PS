import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static PriorityQueue<Integer>[] adjList;
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
		adjList = new PriorityQueue[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new PriorityQueue<>();
		vt = new int[N + 1];
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			adjList[u].add(v);
			adjList[v].add(u);
		}
		dfs(R);
		for (int i = 1; i <= N; i++)
			sb.append(vt[i]).append("\n");
		System.out.print(sb);
	}

	static void dfs(int v) {
		if (vt[v] != 0)
			return;
		vt[v] = seq++;
		while (!adjList[v].isEmpty())
			dfs(adjList[v].poll());
	}
}