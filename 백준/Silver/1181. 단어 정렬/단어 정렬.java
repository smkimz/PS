import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {

	public static void main(String args[]) throws IOException {
		class Word implements Comparable<Word> {
			String word;

			public Word(String word) {
				this.word = word;
			}

			@Override
			public int compareTo(Word o) {
				if (this.word.length() == o.word.length())
					return this.word.compareTo(o.word);
				return Integer.compare(this.word.length(), o.word.length());
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Word> words = new PriorityQueue<>();
		HashSet<String> wordChecker = new HashSet<>();
		while (--N >= 0)
			words.add(new Word(br.readLine()));
		String word;
		while (!words.isEmpty()) {
			word = words.poll().word;
			if (wordChecker.contains(word))
				continue;
			sb.append(word).append("\n");
			wordChecker.add(word);
		}
		System.out.print(sb);
	}
}