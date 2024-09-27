import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int N, M, ans = 0;
	static char[][] maze;
	static int[][] cost, visited, dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };
	static HashMap<Character, Integer> directions = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		maze = new char[N][M];
		cost = new int[N][M];
		visited = new int[N][M];
		for (int i = 0; i < N; i++)
			maze[i] = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				cost[i][j] = Integer.parseInt(st.nextToken());
		}
		char[] dirList = { 'R', 'D', 'L', 'U' };
		for (int i = 0; i < 4; i++)
			directions.put(dirList[i], i);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visited[i][j] != 0)
					continue;
				exploreMaze(i, j);
			}
		}
		System.out.println(ans);
	}

	static void exploreMaze(int srow, int scol) {
		int dir, row = srow, col = scol, min = Integer.MAX_VALUE;
		int[] loc;
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		deque.add(new int[] { row, col });
		visited[row][col] = 1;
		while (true) {
			dir = directions.get(maze[row][col]);
			row += dt[0][dir];
			col += dt[1][dir];
			if (row < 0 || row > N - 1 || col < 0 || col > M - 1 || visited[row][col] == 2) {
				while (!deque.isEmpty()) {
					loc = deque.pollLast();
					visited[loc[0]][loc[1]] = 2;
				}
				return;
			}
			deque.add(new int[] { row, col });
			if (visited[row][col] == 1) {
				while (!deque.isEmpty()) {
					loc = deque.pollLast();
					if (visited[loc[0]][loc[1]] == 2) {
						ans += min;
						return;
					}
					visited[loc[0]][loc[1]] = 2;
					min = Math.min(min, cost[loc[0]][loc[1]]);
				}
			}
			visited[row][col] = 1;
		}
	}
}