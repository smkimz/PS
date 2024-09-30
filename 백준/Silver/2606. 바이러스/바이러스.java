import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N, ans = 0;
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine()), x, y;
		visited = new boolean[N + 1];
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			adjList[x].add(y);
			adjList[y].add(x);
		}
		dfs(1);
		System.out.println(ans);
	}

	static void dfs(int x) {
		visited[x] = true;
		for (int y : adjList[x]) {
			if (visited[y])
				continue;
			++ans;
			dfs(y);
		}
	}
}