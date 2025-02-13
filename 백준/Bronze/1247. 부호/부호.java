import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger bi;
		int N, res;
		for (int i = 0; i < 3; i++) {
			N = Integer.parseInt(br.readLine());
			bi = new BigInteger("0");
			while (--N >= 0)
				bi = bi.add(new BigInteger(br.readLine()));
			res = bi.compareTo(new BigInteger("0"));
			if (res > 0)
				sb.append("+");
			else if (res < 0)
				sb.append("-");
			else
				sb.append("0");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}