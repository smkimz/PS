import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double p = Double.parseDouble(br.readLine()), x;
		while (true) {
			x = Double.parseDouble(br.readLine());
			if (x == 999)
				break;
			sb.append(String.format("%.2f", x - p)).append("\n");
			p = x;
		}
		System.out.print(sb);
	}
}