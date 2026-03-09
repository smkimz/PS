import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] s = br.readLine().toCharArray();
		int i, j, x;
		for (i = s.length - 1; i >= 0; i -= 3) {
			x = 0;
			if (i <= 2)
				break;
			for (j = 0; j < 3; j++)
				x += s[i - j] == '0' ? 0 : Math.pow(2, j);
			sb.append(x);
		}
		x = 0;
		for (j = 0; i >= 0; i--, j++)
			x += s[i] == '0' ? 0 : Math.pow(2, j);
		sb.append(x);
		System.out.println(sb.reverse());
	}
}