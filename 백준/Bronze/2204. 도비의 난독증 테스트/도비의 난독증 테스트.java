import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		String a, b, x, y;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			x = "";
			y = "zzzzzzzzzzzzzzzzzzzz";
			while (--N >= 0) {
				a = br.readLine();
				b = a.toLowerCase();
				if (b.compareTo(y) < 0) {
					x = a;
					y = b;
				}
			}
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}