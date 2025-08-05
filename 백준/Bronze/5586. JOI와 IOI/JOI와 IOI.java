import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int x = 0, y = 0;
		char c;
		for (int i = 2; i < str.length; i++) {
			if (str[i] != 'I' || str[i - 1] != 'O')
				continue;
			c = str[i - 2];
			if (c == 'J')
				++x;
			else if (c == 'I')
				++y;
		}
		System.out.printf("%d\n%d", x, y);
	}
}