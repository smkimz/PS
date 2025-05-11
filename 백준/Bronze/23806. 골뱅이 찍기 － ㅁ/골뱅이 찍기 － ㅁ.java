import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String x = "", y = "", z = "";
		for (int i = 0; i < N; i++) {
			x += '@';
			z += "   ";
		}
		for (int i = 0; i < 5; i++)
			y += x;
		for (int i = 0; i < N; i++)
			sb.append(y).append("\n");
		for (int i = 0; i < 3 * N; i++)
			sb.append(x).append(z).append(x).append("\n");
		for (int i = 0; i < N; i++)
			sb.append(y).append("\n");
		System.out.print(sb);
	}
}