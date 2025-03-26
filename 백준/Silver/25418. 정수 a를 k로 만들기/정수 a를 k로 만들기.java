import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), next;
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(A, 0));
		boolean[] visited = new boolean[K + 1];
		visited[A] = true;
		Node n;
		while (!queue.isEmpty()) {
			n = queue.poll();
			if (n.val == K) {
				System.out.println(n.dist);
				return;
			}
			next = n.val * 2;
			if (next <= K && !visited[next]) {
				queue.add(new Node(next, n.dist + 1));
				visited[next] = true;
			}
			next = n.val + 1;
			if (next <= K && !visited[next]) {
				queue.add(new Node(next, n.dist + 1));
				visited[next] = true;
			}
		}
	}

	static class Node {
		int val, dist;

		public Node(int val, int dist) {
			this.val = val;
			this.dist = dist;
		}
	}
}