import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), score;
		int[][] scores = new int[3][101];
		int[] participants = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				score = Integer.parseInt(st.nextToken());
				if (scores[j][score] > 0)
					scores[j][score] = -1;
				else if (scores[j][score] == 0)
					scores[j][score] = i;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 100; j++) {
				if (scores[i][j] > 0)
					participants[scores[i][j]] += j;
			}
		}
		for (int i = 1; i <= N; i++)
			sb.append(participants[i]).append("\n");
		System.out.print(sb);
	}
}