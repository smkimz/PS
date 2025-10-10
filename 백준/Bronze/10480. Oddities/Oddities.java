import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), X;
		while (--N >= 0) {
			X = Integer.parseInt(br.readLine());
			sb.append(X).append(" is ").append(X % 2 == 0 ? "even\n" : "odd\n");
		}
		System.out.print(sb);
	}
}
