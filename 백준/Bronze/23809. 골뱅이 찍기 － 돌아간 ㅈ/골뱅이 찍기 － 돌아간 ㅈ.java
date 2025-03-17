import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String x = "", y = "";
		for (int i = 0; i < N; i++) {
			x += '@';
			y += ' ';
		}
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(x);
				for (int k = 0; k < 3 - i; k++)
					sb.append(y);
				sb.append(x).append("\n");
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++)
				sb.append(x);
			sb.append("\n");
		}
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(x);
				for (int k = 0; k < 2 + i; k++)
					sb.append(y);
				sb.append(x).append("\n");
			}
		}
		System.out.print(sb);
	}
}