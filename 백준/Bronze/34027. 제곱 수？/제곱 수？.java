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
			N = Double.parseDouble(br.readLine());
			if (Math.sqrt(N) == (int) Math.sqrt(N))
				sb.append(1);
			else
				sb.append(0);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}