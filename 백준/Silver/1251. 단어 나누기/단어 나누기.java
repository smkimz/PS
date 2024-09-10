import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder substr;
		String str = br.readLine(), ans = "~", compstr;
		int l = str.length();
		for (int i = 2; i < l; i++) {
			for (int j = 1; j < i; j++) {
				substr = new StringBuilder();
				substr.append(new StringBuilder(str.substring(0, j)).reverse());
				substr.append(new StringBuilder(str.substring(j, i)).reverse());
				substr.append(new StringBuilder(str.substring(i)).reverse());
				compstr = new String(substr);
				if (compstr.compareTo(ans) >= 0)
					continue;
				ans = new String(compstr);
			}
		}
		System.out.print(ans);
	}
}