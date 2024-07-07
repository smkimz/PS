import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0, Y = 0;
		if (N % 7 == 0)
			X = 1;
		while (N > 0) {
			if (N % 10 == 7) {
				Y = 1;
				break;
			}
			N /= 10;
		}
		System.out.println(X + 2 * Y);
	}
}