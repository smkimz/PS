import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N > 1) {
			if (N % 2 == 0) {
				N /= 2;
				continue;
			}
			System.out.println(0);
			return;
		}
		System.out.println(1);
	}
}