import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] scores = new int[9];
		int scoreA = 0, scoreB = 0;
		boolean x = false;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 9; i++)
			scores[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 9; i++) {
			scoreA += scores[i];
			if (scoreA > scoreB)
				x = true;
			scoreB += Integer.parseInt(st.nextToken());
			if (scoreA > scoreB)
				x = true;
		}
		if (x && scoreA < scoreB)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
