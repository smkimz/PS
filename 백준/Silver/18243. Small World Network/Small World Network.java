import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int number, dist;

		public Node(int number, int dist) {
			this.number = number;
			this.dist = dist;
		}
	}

	static int N;
	static List<Integer>[] adjList;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();

		int A, B;
		while (--K >= 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			adjList[A].add(B);
			adjList[B].add(A);
		}

		boolean isBigWorld;
		for (int i = 1; i <= N; i++) {
			isBigWorld = checkGraph(i);
			if (isBigWorld) {
				System.out.println("Big World!");
				return;
			}
		}
		System.out.println("Small World!");
	}

	static boolean checkGraph(int start) {
		boolean[] vt = new boolean[N + 1];
		vt[start] = true;
		Deque<Node> dq = new ArrayDeque<>();
		dq.add(new Node(start, 0));
		Node friend;
		int size;
		while (!dq.isEmpty()) {
			friend = dq.poll();
			size = adjList[friend.number].size();
			for (int i = 0; i < size; i++) {
				if (vt[adjList[friend.number].get(i)])
					continue;
				if (friend.dist == 6)
					return true;
				dq.add(new Node(adjList[friend.number].get(i), friend.dist + 1));
				vt[adjList[friend.number].get(i)] = true;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (!vt[i])
				return true;
		}
		return false;
	}
}