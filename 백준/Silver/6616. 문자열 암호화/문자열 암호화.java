import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N, len, x, y;
		char[] plainText, cipherText;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			plainText = br.readLine().replaceAll(" ", "").toUpperCase().toCharArray();
			len = plainText.length;
			cipherText = new char[len];
			x = 0;
			y = 0;
			for (int i = 0; i < len; i++) {
				if (x + y >= len) {
					++x;
					y = 0;
				}
				cipherText[x + y] = plainText[i];
				y += N;
			}
			for (int i = 0; i < len; i++)
				sb.append(cipherText[i]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}