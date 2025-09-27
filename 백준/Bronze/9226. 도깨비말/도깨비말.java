import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] word, vowel = new char[] { 'a', 'e', 'i', 'o', 'u' };
		boolean[] isVowel = new boolean['z' + 1];
		int x;
		String prefix;
		for (int i = 0; i < vowel.length; i++)
			isVowel[vowel[i]] = true;
		while (true) {
			word = br.readLine().toCharArray();
			if (word[0] == '#')
				break;
			prefix = new String();
			x = word.length;
			for (int i = 0; i < word.length; i++) {
				if (isVowel[word[i]]) {
					x = i;
					for (int j = x; j < word.length; j++)
						sb.append(word[j]);
					break;
				}
				prefix += word[i];
			}
			sb.append(prefix).append("ay\n");
		}
		System.out.print(sb);
	}
}