import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()), M, x;
		while (--Q >= 0) {
			M = Integer.parseInt(br.readLine());
			x = M / 50 * 12 + 366;
			sb.append(x >= 1440 ? -1 : String.format("%02d:%02d", x / 60, x % 60)).append("\n");
		}
		System.out.print(sb);
	}
}