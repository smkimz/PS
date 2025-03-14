import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(A, 1));
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.x == B) {
				System.out.println(node.count);
				return;
			}
			if (node.x > B)
				continue;
			if (node.x < 100_000_000)
				queue.add(new Node(node.x * 10 + 1, node.count + 1));
			if (node.x <= 500_000_000)
				queue.add(new Node(node.x * 2, node.count + 1));
		}
		System.out.println(-1);
	}

	static class Node {
		int x, count;

		public Node(int x, int count) {
			this.x = x;
			this.count = count;
		}
	}
}