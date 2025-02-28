import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] chars = new int[128];
		for (int i = '1'; i <= '9'; i++)
			chars[i] = i - '0';
		chars['0'] = 9;
		chars['6'] = 9;
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] score;
		for (int i = 0; i < N; i++) {
			score = br.readLine().toCharArray();
			if (score.length == 2)
				ans += chars[score[0]] * 10 + chars[score[1]];
			else if (score.length == 1)
				ans += chars[score[0]];
			else
				ans += 100;
		}
		System.out.println(Math.round(ans / (double) N));
	}
}