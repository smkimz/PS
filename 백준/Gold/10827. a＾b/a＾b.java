import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(st.nextToken()), val = new BigDecimal(1.0);
		int b = Integer.parseInt(st.nextToken());
		while (--b >= 0)
			val = val.multiply(a);
		System.out.println(val.toPlainString());
	}
}