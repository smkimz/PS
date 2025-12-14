import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] scores = new int[] { 13, 7, 5, 3, 3, 2 };

	public static void main(String[] args) throws IOException {
		int x, y;
		x = calc();
		y = calc();
		System.out.println(x > (double) y + 1.5 ? "cocjr0208" : "ekwoo");
	}

	static int calc() throws IOException {
		st = new StringTokenizer(br.readLine());
		int score = 0;
		for (int i = 0; i < 6; i++)
			score += Integer.parseInt(st.nextToken()) * scores[i];
		return score;
	}
}
