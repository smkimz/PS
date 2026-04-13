import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] ckstr = new boolean[128];
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++)
			ckstr[str[i]] = true;
		int x = 'A', y = '9';
		while (x <= 'Z' || y >= '0') {
			for (; x <= 'Z'; x++) {
				if (ckstr[x]) {
					sb.append((char) x++);
					break;
				}
			}
			for (; y >= '0'; y--) {
				if (ckstr[y]) {
					sb.append((char) y--);
					break;
				}
			}
		}
		System.out.print(sb);
	}
}