import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), len;
		HashSet<String> passwords = new HashSet<>();
		String x, y;
		while (--N >= 0) {
			x = br.readLine();
			y = "";
			for (int i = x.length() - 1; i >= 0; i--)
				y += x.charAt(i);
			len = x.length();
			if (passwords.contains(x) || x.equals(y)) {
				System.out.printf("%d %c", len, x.charAt(len / 2));
				return;
			}
			passwords.add(y);
		}
	}
}