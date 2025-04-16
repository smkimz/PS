import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal A = new BigDecimal(st.nextToken()), B = new BigDecimal(st.nextToken()),
				res = A.divide(B, 1001, RoundingMode.HALF_UP);
		System.out.println(res);
	}
}