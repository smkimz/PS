import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken()), u, v, seq = 1;
		PriorityQueue<Integer>[] pqueue = new PriorityQueue[N + 1];
		for (int i = 1; i <= N; i++)
			pqueue[i] = new PriorityQueue<>(Collections.reverseOrder());
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			pqueue[u].add(v);
			pqueue[v].add(u);
		}
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		int[] visited = new int[N + 1];
		visited[K] = seq++;
		deque.add(K);
		while (!deque.isEmpty()) {
			u = deque.poll();
			while (!pqueue[u].isEmpty()) {
				v = pqueue[u].poll();
				if (visited[v] != 0)
					continue;
				visited[v] = seq++;
				deque.add(v);
			}
		}
		for (int i = 1; i <= N; i++)
			sb.append(visited[i]).append("\n");
		System.out.print(sb);
	}
}