import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N, count = 1;
	static int[] visited;
	static PriorityQueue<Integer>[] pqueue;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()), u, v;
		pqueue = new PriorityQueue[N + 1];
		for (int i = 1; i <= N; i++)
			pqueue[i] = new PriorityQueue<>(Collections.reverseOrder());
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			pqueue[u].add(v);
			pqueue[v].add(u);
		}
		visited = new int[N + 1];
		dfs(R);
		for (int i = 1; i <= N; i++)
			sb.append(visited[i]).append("\n");
		System.out.print(sb);
	}

	static void dfs(int start) {
		int end;
		visited[start] = count++;
		while (!pqueue[start].isEmpty()) {
			end = pqueue[start].poll();
			if (visited[end] == 0)
				dfs(end);
		}
	}
}