import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), maxCount = 0;
		char[] P = br.readLine().toCharArray();
		int[] C = new int['z' + 1];
		char maxChar = ' ';
		for (int i = 0; i < N; i++)
			++C[P[i]];
		for (int i = 'a'; i <= 'z'; i++) {
			if (C[i] <= maxCount)
				continue;
			maxChar = (char) i;
			maxCount = C[i];
		}
		System.out.printf("%c %d", maxChar, maxCount);
	}
}