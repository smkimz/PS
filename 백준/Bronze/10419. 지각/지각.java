import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double N;
		while (--T >= 0) {
			N = -Double.parseDouble(br.readLine());
			sb.append((int) Math.floor((1 + Math.sqrt(1 - 4 * N)) / 2.0) - 1).append("\n");
		}
		System.out.print(sb);
	}
}
