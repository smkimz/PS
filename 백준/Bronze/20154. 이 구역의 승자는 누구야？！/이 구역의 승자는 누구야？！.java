import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] strokes = { 3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1 },
				X = new int[128];
		for (int i = 'A'; i <= 'Z'; i++)
			X[i] = strokes[i - 'A'];
		char[] S = br.readLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < S.length; i++)
			sum += X[S[i]];
		System.out.println(sum % 2 == 1 ? "I'm a winner!" : "You're the winner?");
	}
}