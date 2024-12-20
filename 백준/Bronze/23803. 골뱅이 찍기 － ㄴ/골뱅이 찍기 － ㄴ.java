import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String x = "", y = "";
		for (int i = 0; i < N; i++) {
			x += "@";
			y += "@@@@@";
		}
		for (int i = 0; i < 4 * N; i++)
			sb.append(x).append("\n");
		for (int i = 0; i < N; i++)
			sb.append(y).append("\n");
		System.out.print(sb);
	}
}