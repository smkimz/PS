import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, X;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			X = 0;
			while (N > 0) {
				if (N % 2 == 1)
					sb.append(X).append(" ");
				N /= 2;
				++X;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}