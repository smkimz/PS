import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		long sum;
		while (--T >= 0) {
			br.readLine();
			N = Integer.parseInt(br.readLine());
			sum = 0;
			for (int i = 0; i < N; i++) {
				sum += Long.parseLong(br.readLine());
				sum %= N;
			}
			if (sum % N == 0)
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		System.out.print(sb);
	}
}
