import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		char sign = br.readLine().charAt(0);
		BigInteger B = new BigInteger(br.readLine());
		if (sign == '*')
			System.out.println(A.multiply(B));
		else
			System.out.println(A.add(B));
	}
}