import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] letters = new char[128], word = br.readLine().toCharArray();
		for (int i = 'A'; i <= 'C'; i++)
			letters[i] = (char) (i + 23);
		for (int i = 'D'; i <= 'Z'; i++)
			letters[i] = (char) (i - 3);
		for (int i = 0; i < word.length; i++)
			sb.append(letters[word[i]]);
		System.out.println(sb);
	}
}