import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0, Y = 0;
		while (--N >= 0 && Math.abs(X - Y) < 2) {
			if (br.readLine().charAt(0) == 'D')
				++X;
			else
				++Y;
		}
		System.out.printf("%d:%d", X, Y);
	}
}