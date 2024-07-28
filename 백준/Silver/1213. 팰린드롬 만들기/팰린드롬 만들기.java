import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] count = new int[26];
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++)
			++count[str[i] - 'A'];
		boolean isEven = str.length % 2 == 0 ? true : false;
		char midChar = ' ';
		for (int i = 0; i < 26; i++) {
			if (count[i] % 2 == 1) {
				if (!isEven) {
					if (midChar != ' ') {
						System.out.println("I'm Sorry Hansoo");
						return;
					}
					midChar = (char) (i + 'A');
					count[i] = (count[i] - 1) / 2;
					continue;
				} else {
					System.out.println("I'm Sorry Hansoo");
					return;
				}
			}
			count[i] /= 2;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] == 0)
				continue;
			for (int j = 0; j < count[i]; j++)
				sb.append((char) (i + 'A'));
		}
		if (!isEven)
			sb.append(midChar);
		for (int i = 25; i >= 0; i--) {
			if (count[i] == 0)
				continue;
			for (int j = 0; j < count[i]; j++)
				sb.append((char) (i + 'A'));
		}
		System.out.println(sb);
	}
}