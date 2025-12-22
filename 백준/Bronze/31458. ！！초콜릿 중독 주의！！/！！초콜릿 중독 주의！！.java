import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), idx = 0;
		char[] x;
		char y;
		while (--T >= 0) {
			x = br.readLine().toCharArray();
			for (int i = 0; i < x.length; i++) {
				if (x[i] != '!') {
					idx = i;
					break;
				}
			}
			if (idx != x.length - 1)
				y = '1';
			else
				y = x[idx];
			if (idx % 2 == 0)
				sb.append(y).append("\n");
			else
				sb.append(y == '0' ? '1' : '0').append("\n");
		}
		System.out.print(sb);
	}
}
