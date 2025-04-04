import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String M = st.nextToken();
		BigInteger bi = new BigInteger("1");
		st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			bi = bi.multiply(new BigInteger(st.nextToken()));
		System.out.println(bi.remainder(new BigInteger(M)));
	}
}