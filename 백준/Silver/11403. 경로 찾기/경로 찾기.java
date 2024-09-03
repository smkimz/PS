import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] adjNodes = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			adjNodes[i] = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				if (st.nextToken().charAt(0) == '0')
					continue;
				adjNodes[i].add(j);
			}
		}

		ArrayDeque<Integer> dQueue = new ArrayDeque<>();
		boolean[][] visited = new boolean[N][N];
		int start, end;
		for (int n = 0; n < N; n++) {
			dQueue.add(n);
			while (!dQueue.isEmpty()) {
				start = dQueue.poll();
				for (int i = 0; i < adjNodes[start].size(); i++) {
					end = adjNodes[start].get(i);
					if (visited[n][end])
						continue;
					visited[n][end] = true;
					dQueue.add(end);
				}
			}
			for (int i = 0; i < N; i++)
				sb.append(visited[n][i] ? "1 " : "0 ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}