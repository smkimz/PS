import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Math.pow(Integer.parseInt(br.readLine()), 2), x = N * Math.PI, y = N * 2;
		System.out.printf("%f\n%f", x, y);
	}
}