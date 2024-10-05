import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), coin2 = 0, coin5 = 0;
		if (N == 1 || N == 3)
			coin5 = -1;
		else if (N % 5 == 0)
			coin5 = N / 5;
		else if (N % 2 == 0) {
			coin5 = N / 5;
			if (coin5 % 2 == 1)
				coin5 = coin5 - 1 >= 0 ? coin5 - 1 : 0;
			coin2 = (N - (coin5 * 5)) / 2;
		} else {
			coin5 = N / 5;
			if (coin5 % 2 == 0)
				coin5 = coin5 - 1 >= 0 ? coin5 - 1 : 0;
			coin2 = (N - (coin5 * 5)) / 2;
		}
		System.out.println(coin5 + coin2);
	}
}