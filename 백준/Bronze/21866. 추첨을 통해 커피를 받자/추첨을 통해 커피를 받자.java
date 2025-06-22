import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] maxScores = new int[] { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
		StringTokenizer st = new StringTokenizer(br.readLine());
		int score, sum = 0;
		for (int i = 0; i < 9; i++) {
			score = Integer.parseInt(st.nextToken());
			if (score > maxScores[i]) {
				System.out.println("hacker");
				return;
			}
			sum += score;
		}
		System.out.println(sum < 100 ? "none" : "draw");
	}
}