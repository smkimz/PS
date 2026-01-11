import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int ans = 0;
		ans += calcScore(4);
		ans += calcScore(2);
		System.out.print(ans);
	}

	static int calcScore(int x) throws IOException {
		int score, min = 101, totalScore = 0;
		while (--x >= 0) {
			score = Integer.parseInt(br.readLine());
			min = Math.min(min, score);
			totalScore += score;
		}
		totalScore -= min;
		return totalScore;
	}
}
