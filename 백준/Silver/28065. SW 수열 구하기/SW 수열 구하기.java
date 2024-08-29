import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), num = 1, mult = 1;
		for (int i = N - 1; i >= 0; i--) {
			sb.append(num).append(" ");
			num += i * mult;
			mult *= -1;
		}
		System.out.print(sb);
	}
}