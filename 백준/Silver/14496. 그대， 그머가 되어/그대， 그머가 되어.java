import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a, b, N, M, x, y, next;
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		ArrayDeque<Integer>[] isConnected = new ArrayDeque[N + 1];
		for (int i = 1; i <= N; i++)
			isConnected[i] = new ArrayDeque<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			isConnected[x].add(y);
			isConnected[y].add(x);
		}
		ArrayDeque<Node> queue = new ArrayDeque<>();
		boolean[] isVisited = new boolean[N + 1];
		queue.add(new Node(a, 0));
		isVisited[a] = true;
		Node node;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.str == b) {
				System.out.println(node.count);
				return;
			}
			while (!isConnected[node.str].isEmpty()) {
				next = isConnected[node.str].poll();
				if (isVisited[next])
					continue;
				queue.add(new Node(next, node.count + 1));
				isVisited[next] = true;
			}
		}
		System.out.println(-1);
	}

	static class Node {
		int str, count;

		public Node(int str, int count) {
			this.str = str;
			this.count = count;
		}
	}
}