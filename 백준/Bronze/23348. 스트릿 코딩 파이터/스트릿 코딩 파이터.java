import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] difficulty = new int[3];
		for (int i = 0; i < 3; i++)
			difficulty[i] = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine()), score, maxScore = 0;
		for (int i = 0; i < N; i++) {
			score = 0;
			for (int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 3; k++)
					score += Integer.parseInt(st.nextToken()) * difficulty[k];
			}
			maxScore = Math.max(maxScore, score);
		}
		System.out.println(maxScore);
	}
}