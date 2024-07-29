import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), p, np, period;
		char[] penalties;
		p: while (--N >= 0) {
			penalties = br.readLine().toCharArray();
			p = 0;
			np = 0;
			period = 0;
			for (int i = 0; i < penalties.length; i++) {
				if (penalties[i] >= 'A' && penalties[i] <= 'Z')
					np += penalties[i] - 'A' + 10;
				else
					np += penalties[i] - '0';
				if (np / 10 >= 4) {
					sb.append(period);
					if (np / 10 > 4)
						sb.append("(09)");
					else if (np / 10 == 4)
						sb.append("(weapon)");
					sb.append("\n");
					continue p;
				}
				if (p / 10 < np / 10)
					period += np / 10;
				p = np;
			}
			sb.append(period).append("\n");
		}
		System.out.print(sb);
	}
}