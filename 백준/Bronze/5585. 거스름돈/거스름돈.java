import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 1000 - Integer.parseInt(br.readLine()), ans = 0;
		int[] coins = { 500, 100, 50, 10, 5, 1 };
		for (int i = 0; i <= 5; i++) {
			ans += N / coins[i];
			N %= coins[i];
		}
		System.out.println(ans);
	}
}