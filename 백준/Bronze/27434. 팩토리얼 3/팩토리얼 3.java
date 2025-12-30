import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		System.out.println(fac(1, N));
	}

	public static BigInteger fac(int a, int N) {
		BigInteger ret = BigInteger.valueOf(a);
		if (a < N) {
			int b = (a + N) / 2;
			ret = fac(a, b).multiply(fac(b + 1, N));
		}
		return ret;
	}
}