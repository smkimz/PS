import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len, maxLen = 0;
		String input, word, maxLenWord = "";
		while (true) {
			input = br.readLine();
			len = 0;
			word = "";
			input += '.';
			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
						|| (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || input.charAt(i) == '-') {
					++len;
					word += input.charAt(i);
					continue;
				}
				if (word.equals("E-N-D")) {
					System.out.println(maxLenWord.toLowerCase());
					return;
				}
				if (len > maxLen) {
					maxLen = word.length();
					maxLenWord = word;
				}
				len = 0;
				word = "";
			}
		}
	}
}