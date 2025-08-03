import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N, cnt, maxCnt;
		char[] word, ans;
		boolean[] isVowel = new boolean['z' + 1];
		isVowel['a'] = true;
		isVowel['e'] = true;
		isVowel['i'] = true;
		isVowel['o'] = true;
		isVowel['u'] = true;
		isVowel['y'] = true;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			maxCnt = 0;
			ans = null;
			while (--N >= 0) {
				word = br.readLine().toCharArray();
				cnt = 0;
				for (int i = 0; i < word.length - 1; i++) {
					if (!isVowel[word[i]] || word[i] != word[i + 1])
						continue;
					++cnt;
					++i;
				}
				if (cnt < maxCnt)
					continue;
				maxCnt = cnt;
				ans = word;
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}