import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] word, vowel = { 'a', 'e', 'i', 'o', 'u' };
		int[] count = new int[127];
		int T = Integer.parseInt(br.readLine()), ans;
		while (--T >= 0) {
			word = br.readLine().toCharArray();
			for (int i = 0; i < word.length; i++)
				++count[word[i]];
			ans = 0;
			for (int i = 0; i < 5; i++) {
				ans += count[vowel[i]];
				count[vowel[i]] = 0;
			}
			sb.append("The number of vowels in ").append(word).append(" is ").append(ans).append(".\n");
		}
		System.out.print(sb);
	}
}