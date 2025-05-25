import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), score, ans = 0;
		int[] scores = new int[5];
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			score = 0;
			for (int i = 0; i < 2; i++)
				score = Math.max(score, Integer.parseInt(st.nextToken()));
			for (int i = 0; i < 5; i++)
				scores[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(scores);
			score += scores[3] + scores[4];
			ans = Math.max(ans, score);
		}
		System.out.println(ans);
	}
}