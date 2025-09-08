import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int score = 0;
		for (int i = -1; i <= 1; i += 2) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 3; j++)
				score += Integer.parseInt(st.nextToken()) * i * j;
		}
		if (score == 0)
			System.out.println(0);
		else
			System.out.println(score < 0 ? 1 : 2);
	}
}