import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String x = new String(), y = new String(), z = new String();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < N; j++) {
				x += i % 2 == 0 ? '@' : ' ';
				y += i != 3 ? '@' : ' ';
				z += i != 1 ? '@' : ' ';
			}
		}
		x += "\n";
		y += "\n";
		z += "\n";
		for (int i = 0; i < N; i++)
			sb.append(y);
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < N; j++)
				sb.append(x);
		}
		for (int i = 0; i < N; i++)
			sb.append(z);
		System.out.print(sb);
	}
}
