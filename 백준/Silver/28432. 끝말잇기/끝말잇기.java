import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M;
		HashSet<String> words = new HashSet<>();
		String word;
		boolean findQuestion = false, findNextWord = false;
		char prev = '?', next = '?';
		for (int i = 0; i < N; i++) {
			word = br.readLine();
			if (word.charAt(0) == '?') {
				findQuestion = true;
				continue;
			}
			words.add(word);
			if (!findQuestion)
				prev = word.charAt(word.length() - 1);
			if (findQuestion && !findNextWord) {
				next = word.charAt(0);
				findNextWord = true;
			}
		}
		M = Integer.parseInt(br.readLine());
		while (--M >= 0) {
			word = br.readLine();
			if (words.contains(word))
				continue;
			if (prev != '?' && prev != word.charAt(0))
				continue;
			if (next != '?' && next != word.charAt(word.length() - 1))
				continue;
			System.out.println(word);
			return;
		}
	}
}