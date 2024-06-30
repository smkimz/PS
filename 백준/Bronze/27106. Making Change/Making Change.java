import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 100 - Integer.parseInt(br.readLine());
		int[] coins = { 25, 10, 5, 1 };
		for (int i = 0; i <= 3; i++) {
			sb.append(N / coins[i]).append(" ");
			N %= coins[i];
		}
		System.out.print(sb);
	}
}