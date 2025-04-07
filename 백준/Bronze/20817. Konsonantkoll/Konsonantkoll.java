import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] consonants = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
				'v', 'w', 'x', 'z' }, str = br.readLine().toCharArray();
		boolean[] isConsonant = new boolean[128];
		for (int i = 0; i < consonants.length; i++)
			isConsonant[consonants[i]] = true;
		int count = 0;
		sb.append(str[0]);
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1] == str[i] && isConsonant[str[i]]) {
				if (count >= 1)
					continue;
				++count;
			} else
				count = 0;
			sb.append(str[i]);
		}
		System.out.print(sb);
	}
}