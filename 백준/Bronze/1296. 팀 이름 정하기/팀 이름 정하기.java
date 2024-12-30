import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ydName = br.readLine(), teamName, love = new String("LOVE"),
				maxTeamName = new String("ZZZZZZZZZZZZZZZZZZZZ");
		int[] ydScore = new int[128], teamScore;
		for (int i = 0; i < ydName.length(); i++)
			++ydScore[ydName.charAt(i)];
		int N = Integer.parseInt(br.readLine()), score, maxScore = 0;
		while (--N >= 0) {
			teamName = br.readLine();
			teamScore = new int[128];
			for (int i = 0; i < teamName.length(); i++) {
				++teamScore[teamName.charAt(i)];
			}
			score = 1;
			for (int i = 0; i <= 2; i++) {
				for (int j = i + 1; j <= 3; j++)
					score *= (teamScore[love.charAt(i)] + ydScore[love.charAt(i)] + teamScore[love.charAt(j)]
							+ ydScore[love.charAt(j)]) % 100;
			}
			score %= 100;
			if (score < maxScore || (score == maxScore && maxTeamName.compareTo(teamName) < 0))
				continue;
			maxScore = score;
			maxTeamName = teamName;
		}
		System.out.println(maxTeamName);
	}
}