import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), steak;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] steaks = new long[N];
		steaks[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			steak = Integer.parseInt(st.nextToken());
			steaks[i] = lcm(Math.max(steaks[i - 1], steak), Math.min(steaks[i - 1], steak));
		}
		System.out.println(steaks[N - 1] * 2);
	}

	static long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}

	static long lcm(long x, long y) {
		return x * y / gcd(x, y);
	}
}