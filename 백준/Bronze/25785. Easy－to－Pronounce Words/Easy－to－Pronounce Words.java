import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray(), vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
		boolean[] isVowel = new boolean['z' + 1];
		for (int i = 0; i < 5; i++)
			isVowel[vowels[i]] = true;
		for (int i = 1; i < str.length; i++) {
			if (isVowel[str[i]] == isVowel[str[i - 1]]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}