import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int len = N.length();
		double M = Double.parseDouble(N) / 10;
		for (int i = 0; i < len - 1; i++) {
			M = Math.round(M);
			M /= 10;
		}
		System.out.println((int) (M * Math.pow(10, len)));
	}
}