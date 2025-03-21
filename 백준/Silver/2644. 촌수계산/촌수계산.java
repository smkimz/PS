import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M, start, end, x, y, next;
		ArrayDeque<Integer>[] nodes = new ArrayDeque[N + 1];
		for (int i = 1; i <= N; i++)
			nodes[i] = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			nodes[x].add(y);
			nodes[y].add(x);
		}
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(start, 0));
		boolean[] visited = new boolean[N + 1];
		visited[start] = true;
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.person == end) {
				System.out.println(node.depth);
				return;
			}
			while (!nodes[node.person].isEmpty()) {
				next = nodes[node.person].poll();
				if (visited[next])
					continue;
				queue.add(new Node(next, node.depth + 1));
				visited[next] = true;
			}
		}
		System.out.println(-1);
	}

	static class Node {
		int person, depth;

		public Node(int person, int depth) {
			this.person = person;
			this.depth = depth;
		}
	}
}