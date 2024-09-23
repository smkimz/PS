import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] scoreArr = new int[128];
		int[][] scores = { { 1, 3, 3, 5, 9 }, { -1, -3, -3, -5, -9 } };
		char[][] chessPieces = { { 'P', 'N', 'B', 'R', 'Q' }, { 'p', 'n', 'b', 'r', 'q' } };
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 4; j++)
				scoreArr[chessPieces[i][j]] = scores[i][j];
		}

		int score = 0;
		char[] deployment;
		for (int i = 0; i < 8; i++) {
			deployment = br.readLine().toCharArray();
			for (int j = 0; j < 8; j++)
				score += scoreArr[deployment[j]];
		}

		System.out.println(score);
	}
}