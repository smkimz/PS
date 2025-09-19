import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x, sum;
		char[] card;
		while (--T >= 0) {
			card = br.readLine().toCharArray();
			sum = 0;
			for (int i = 15; i >= 0; i--) {
				x = card[i] - '0';
				if (i % 2 == 0) {
					x *= 2;
					if (x >= 10)
						x = x / 10 + x % 10;
				}
				sum += x;
			}
			if (sum % 10 == 0)
				sb.append('T');
			else
				sb.append('F');
			sb.append("\n");
		}
		System.out.print(sb);
	}
}