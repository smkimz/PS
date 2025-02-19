import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double X, Y;
		String a, b;
		while (true) {
			X = Double.parseDouble(br.readLine());
			if (X == -1.0)
				break;
			a = String.format("%.2f", X);
			Y = Math.round(X * 167) / 1000.0;
			b = String.format("%.2f", Y);
			sb.append("Objects weighing ").append(a).append(" on Earth will weigh ").append(b)
					.append(" on the moon.\n");
		}
		System.out.print(sb);
	}
}