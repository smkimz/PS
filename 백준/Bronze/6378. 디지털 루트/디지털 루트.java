import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N;
		int M;
		while (true) {
			N = br.readLine();
			if (N.length() == 1 && N.charAt(0) == '0')
				break;
			while (true) {
				M = 0;
				for (int i = 0; i < N.length(); i++)
					M += N.charAt(i) - '0';
				if (M <= 9) {
					sb.append(M).append("\n");
					break;
				}
				N = String.valueOf(M);
			}
		}
		System.out.print(sb);
	}
}