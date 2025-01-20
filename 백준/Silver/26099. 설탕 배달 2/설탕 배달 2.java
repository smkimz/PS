import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine()), ans = 0;
		while (N > 0) {
			if (N % 5 == 0) {
				ans += N / 5;
				N = 0;
			} else {
				ans += 1;
				N -= 3;
			}
		}
		System.out.println(N == 0 ? ans : -1);
	}
}