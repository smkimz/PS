import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> primes = new ArrayList<>();
		boolean[] isNotPrime = new boolean[100001];
		int T = Integer.parseInt(br.readLine()), N, x, y;
		for (int i = 2; i <= 99991; i++) {
			if (isNotPrime[i])
				continue;
			primes.add(i);
			x = 2 * i;
			while (x <= 100000) {
				isNotPrime[x] = true;
				x += i;
			}
		}
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			for (int i = 0; i < primes.size(); i++) {
				x = primes.get(i);
				if (x > N)
					break;
				y = 0;
				while (N % x == 0) {
					N /= x;
					++y;
				}
				if (y >= 1)
					sb.append(x).append(" ").append(y).append("\n");
			}
		}
		System.out.print(sb);
	}
}