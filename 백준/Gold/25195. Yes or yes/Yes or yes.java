import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[] adjList;
	static int[] visited;
	static boolean existNotMeeting = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), S;
		visited = new int[N + 1];
		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			adjList[i] = new ArrayList<>();
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			adjList[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
		}
		S = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (--S >= 0)
			visited[Integer.parseInt(st.nextToken())] = 1;
		dfs(1);
		if (existNotMeeting)
			System.out.println("yes");
		else
			System.out.println("Yes");
	}

	static void dfs(int node) {
		if (visited[node] >= 1 || existNotMeeting)
			return;
		visited[node] = 1;
		if (adjList[node].size() == 0) {
			existNotMeeting = true;
			return;
		}
		for (int n : adjList[node])
			dfs(n);
	}
}