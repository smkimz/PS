import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int score = 1, totalScore = 1;
		for (int i = 1; i < S.length; i++) {
			if (S[i] > S[i - 1])
				++score;
			else
				score = 1;
			totalScore += score;
		}
		System.out.println(totalScore);
	}
}