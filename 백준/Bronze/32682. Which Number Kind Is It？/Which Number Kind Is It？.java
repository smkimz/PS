import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		boolean isNotEmpty;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			isNotEmpty = false;
			if (N % 2 == 1) {
				sb.append('O');
				isNotEmpty = true;
			}
			if (Math.sqrt(N) == (double) ((int) Math.sqrt(N))) {
				sb.append('S');
				isNotEmpty = true;
			}
			if (!isNotEmpty)
				sb.append("EMPTY");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}