import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] cards;
		int[] score = new int['Z' + 1];
		score['A'] = 4;
		score['K'] = 3;
		score['Q'] = 2;
		score['J'] = 1;
		while (--N >= 0) {
			cards = br.readLine().toCharArray();
			for (int i = 0; i < 13; i++)
				ans += score[cards[i]];
		}
		System.out.println(ans);
	}
}