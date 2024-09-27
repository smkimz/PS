import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static int K, size;
	static int[] visit;
	static ArrayDeque<Integer>[] nodes;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		K = Integer.parseInt(br.readLine());
		size = (int) Math.pow(2, K) - 1;
		nodes = new ArrayDeque[K];
		for (int i = 0; i < K; i++)
			nodes[i] = new ArrayDeque<>();
		visit = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++)
			visit[i] = Integer.parseInt(st.nextToken());
		checkNode(0, size, 0);
		for (int i = 0; i < K; i++) {
			while (!nodes[i].isEmpty())
				sb.append(nodes[i].poll()).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void checkNode(int start, int end, int depth) {
		if (depth >= K)
			return;
		int mid = (start + end) / 2;
		nodes[depth].add(visit[mid]);
		checkNode(start, mid - 1, depth + 1);
		checkNode(mid + 1, end, depth + 1);
	}
}