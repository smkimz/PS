import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Boolean> check = new HashMap<Integer, Boolean>();
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), streak, max;
		int[] score = new int[N];
		String[] name = new String[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			streak = 0;
			max = 0;
			for (int j = 0; j < M; j++) {
				if (st.nextToken().equals("*")) {
					max = Math.max(max, streak);
					streak = 0;
					continue;
				}
				++streak;
			}
			name[i] = st.nextToken();
			score[i] = Math.max(max, streak);
			check.putIfAbsent(score[i], true);
		}
		sb.append(check.size()).append("\n");
		for (int i = 0; i < N; i++)
			sb.append(score[i]).append(" ").append(name[i]).append("\n");
		System.out.print(sb);
	}
}