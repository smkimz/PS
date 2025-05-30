import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		String x, y;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			if (N == 1) {
				sb.append("#\n\n");
				continue;
			}
			x = "#";
			y = "#";
			for (int i = 0; i < N - 2; i++) {
				x += '#';
				y += 'J';
			}
			x += "#\n";
			y += "#\n";
			sb.append(x);
			for (int i = 0; i < N - 2; i++)
				sb.append(y);
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}