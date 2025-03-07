import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		while (N > 0) {
			ans = ans * 2 + (N % 2);
			N /= 2;
		}
		System.out.println(ans);
	}
}