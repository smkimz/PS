import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S;
		int x;
		while (true) {
			S = br.readLine();
			if (S.charAt(0) == '0')
				break;
			x = Integer.parseInt(S);
			if (x < 10) {
				sb.append(x).append("\n");
				continue;
			}
			sb.append(x).append(' ');
			while (true) {
				x = 1;
				for (int i = S.length() - 1; i >= 0; i--)
					x *= S.charAt(i) - '0';
				if (x < 10) {
					sb.append(x).append("\n");
					break;
				}
				sb.append(x).append(' ');
				S = String.valueOf(x);
			}
		}
		System.out.print(sb);
	}
}
