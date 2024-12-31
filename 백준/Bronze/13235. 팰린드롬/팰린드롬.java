import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toCharArray();
		int len = word.length;
		for (int i = 0; i < len / 2; i++) {
			if (word[i] == word[len - i - 1])
				continue;
			System.out.println("false");
			return;
		}
		System.out.println("true");
	}
}