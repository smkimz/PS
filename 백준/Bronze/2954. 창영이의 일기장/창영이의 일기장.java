import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		int l = str.length;
		boolean[] isVowel = new boolean[128];
		isVowel['a'] = true;
		isVowel['e'] = true;
		isVowel['i'] = true;
		isVowel['o'] = true;
		isVowel['u'] = true;
		for (int i = 0; i < l; i++) {
			sb.append(str[i]);
			if (i < l - 2 && isVowel[str[i]] && str[i + 1] == 'p' && str[i + 2] == str[i])
				i += 2;
		}
		System.out.println(sb);
	}
}
