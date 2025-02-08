import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int score, maxScore = 0, winner = 0;
		for (int i = 1; i <= 5; i++) {
			st = new StringTokenizer(br.readLine());
			score = 0;
			while (st.hasMoreTokens())
				score += Integer.parseInt(st.nextToken());
			if (score <= maxScore)
				continue;
			maxScore = score;
			winner = i;
		}
		System.out.printf("%d %d", winner, maxScore);
	}
}