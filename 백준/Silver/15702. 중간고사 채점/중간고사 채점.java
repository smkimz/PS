import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), examinee, score;
		int[] scores = new int[N], ans = new int[2];
		ans[0] = 100000;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			scores[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			examinee = Integer.parseInt(st.nextToken());
			score = 0;
			for (int j = 0; j < N; j++) {
				if (st.nextToken().equals("X"))
					continue;
				score += scores[j];
			}
			if (score > ans[1] || (score == ans[1] && examinee < ans[0])) {
				ans[0] = examinee;
				ans[1] = score;
			}
		}
		System.out.println(ans[0] + " " + ans[1]);
	}
}
