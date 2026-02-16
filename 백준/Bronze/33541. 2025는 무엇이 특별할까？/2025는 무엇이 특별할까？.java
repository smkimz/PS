import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), a, b, c;
		for (int i = X + 1; i <= 9999; i++) {
			a = i / 100;
			b = i % 100;
			c = (int) Math.pow(a + b, 2);
			if (i == c) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}