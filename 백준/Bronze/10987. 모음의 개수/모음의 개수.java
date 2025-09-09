import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] isVowel = new boolean['z' + 1];
		int ans = 0;
		char[] vowel = new char[] { 'a', 'e', 'i', 'o', 'u' }, word = br.readLine().toCharArray();
		for (int i = 0; i < vowel.length; i++)
			isVowel[vowel[i]] = true;
		for (int i = 0; i < word.length; i++)
			ans += isVowel[word[i]] ? 1 : 0;
		System.out.println(ans);
	}
}