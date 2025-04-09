import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal x = new BigDecimal(1.0 / Math.pow(2, Integer.parseInt(br.readLine())));
		System.out.println(x.toPlainString());
	}
}