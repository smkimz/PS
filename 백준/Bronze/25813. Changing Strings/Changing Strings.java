import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int x = 0, y = str.length;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'U') {
				x = i;
				break;
			}
			str[i] = '-';
		}
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] == 'F') {
				y = i;
				break;
			}
			str[i] = '-';
		}
		for (int i = x + 1; i < y; i++)
			str[i] = 'C';
		System.out.println(str);
	}
}