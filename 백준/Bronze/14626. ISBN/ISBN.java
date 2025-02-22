import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] isbn = br.readLine().toCharArray();
		int x = 0, w = 0;
		for (int i = 0; i < isbn.length; i++) {
			if (isbn[i] == '*')
				w = i % 2 == 0 ? 1 : 3;
			else
				x += (isbn[i] - '0') * (i % 2 == 0 ? 1 : 3);
		}
		for (int i = 0; i <= 9; i++) {
			if ((i * w + x) % 10 == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}