import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String x = "@", y = "@";
		for (int i = 0; i < N; i++) {
			x += '@';
			y += ' ';
		}
		x += "@\n";
		y += "@\n";
		sb.append(x);
		for (int i = 0; i < N; i++)
			sb.append(y);
		sb.append(x);
		System.out.print(sb);
	}
}