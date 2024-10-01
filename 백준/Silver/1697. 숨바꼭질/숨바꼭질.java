import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		bfs();
	}

	static void bfs() {
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.add(N);
		int[] visited = new int[Math.max(K * 2, N + 1)];
		Arrays.fill(visited, Integer.MAX_VALUE);
		visited[N] = 0;
		int pos, nextPos, nextTime;
		while (!queue.isEmpty()) {
			pos = queue.poll();
			if (pos == K)
				break;
			nextTime = visited[pos] + 1;
			if (pos < K) {
				nextPos = pos * 2;
				if (pos > 0 && visited[nextPos] > nextTime) {
					queue.add(nextPos);
					visited[nextPos] = nextTime;
				}
				nextPos = pos + 1;
				if (visited[nextPos] > nextTime) {
					queue.add(nextPos);
					visited[nextPos] = nextTime;
				}
			}
			if (pos > 0) {
				nextPos = pos - 1;
				if (visited[nextPos] > nextTime) {
					queue.add(nextPos);
					visited[nextPos] = nextTime;
				}
			}
		}
		System.out.println(visited[K]);
	}
}