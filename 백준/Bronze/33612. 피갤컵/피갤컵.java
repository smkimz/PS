import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 8 + (N - 1) * 7, y = 2024 + x / 12, m = x % 12;
		y -= m == 0 ? 1 : 0;
		m = m == 0 ? 12 : m;
		System.out.printf("%d %d", y, m);
	}
}