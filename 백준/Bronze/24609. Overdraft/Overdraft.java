import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, bal = 0, min = 0;
		while (--N >= 0) {
			x = Integer.parseInt(br.readLine());
			bal -= x;
			min = Math.max(min, bal);
		}
		System.out.println(Math.abs(min));
	}
}