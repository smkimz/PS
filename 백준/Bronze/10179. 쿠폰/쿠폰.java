import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double p;
		while (--T >= 0) {
			p = Double.parseDouble(br.readLine()) * 0.8;
			sb.append(String.format("$%.2f\n", p));
		}
		System.out.print(sb);
	}
}