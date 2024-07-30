import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int M, X, Y, score = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		M = X;
		while (st.hasMoreTokens()) {
			Y = Integer.parseInt(st.nextToken());
			if (Y - X != 1) {
				score += M;
				M = Y;
			}
			X = Y;
		}
		score += M;
		System.out.println(score);
	}
}