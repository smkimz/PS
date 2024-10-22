import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				R = Integer.parseInt(st.nextToken()), u, v, cnt = 1;
		PriorityQueue<Integer>[] nodes = new PriorityQueue[N + 1];
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		int[] visited = new int[N + 1];
		for (int i = 1; i <= N; i++)
			nodes[i] = new PriorityQueue<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			nodes[u].add(v);
			nodes[v].add(u);
		}
		queue.add(R);
		visited[R] = cnt++;
		while (!queue.isEmpty()) {
			u = queue.poll();
			while (!nodes[u].isEmpty()) {
				v = nodes[u].poll();
				if (visited[v] != 0)
					continue;
				queue.add(v);
				visited[v] = cnt++;
			}
		}
		for (int i = 1; i <= N; i++)
			sb.append(visited[i]).append("\n");
		System.out.print(sb);
	}
}