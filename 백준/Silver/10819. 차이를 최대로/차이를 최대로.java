import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, ans = Integer.MIN_VALUE;
	static int[] arr, selected;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		selected = new int[N];
		visited = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++)
			backtracking(i, 0);
		System.out.println(ans);
	}

	private static void backtracking(int x, int y) {
		visited[x] = true;
		selected[y] = arr[x];
		if (y == N - 1) {
			int sum = 0;
			for (int i = 0; i < N - 1; i++)
				sum += Math.abs(selected[i] - selected[i + 1]);
			ans = Math.max(ans, sum);
			visited[x] = false;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			backtracking(i, y + 1);
		}
		visited[x] = false;
	}
}