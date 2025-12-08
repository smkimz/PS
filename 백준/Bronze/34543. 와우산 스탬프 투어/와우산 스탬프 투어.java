import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), W = Integer.parseInt(br.readLine()), score = N * 10;
		if (N >= 3) {
			score += 20;
			if (N >= 5)
				score += 50;
		}
		if (W > 1000)
			score -= 15;
		System.out.println(score < 0 ? 0 : score);
	}
}
