import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			sb.append((N + 1) % (N % 100) == 0 ? "Good" : "Bye").append("\n");
		}
		System.out.print(sb);
	}
}