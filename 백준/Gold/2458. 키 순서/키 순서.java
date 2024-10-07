import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N, cnt;
	static boolean[][] visited;
	static ArrayList<Integer>[][] adjList;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), x, y, ans = 0;
		adjList = new ArrayList[2][N + 1];
		for (int i = 1; i <= N; i++) {
			adjList[0][i] = new ArrayList<>();
			adjList[1][i] = new ArrayList<>();
		}

		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			adjList[0][x].add(y);
			adjList[1][y].add(x);
		}

		for (int i = 1; i <= N; i++) {
			visited = new boolean[2][N + 1];
			cnt = 0;
			depthFirstSearch(i, 0);
			depthFirstSearch(i, 1);
			if (cnt != N + 1)
				continue;
			++ans;
		}
		System.out.println(ans);
	}

	static void depthFirstSearch(int num, int isReverse) {
		if (visited[isReverse][num])
			return;
		visited[isReverse][num] = true;
		++cnt;
		for (int i : adjList[isReverse][num])
			depthFirstSearch(i, isReverse);
	}
}