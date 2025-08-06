import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		double B, N;
		int A, x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			B = Double.parseDouble(st.nextToken());
			N = Double.parseDouble(st.nextToken());
			if (B == 0 && N == 0)
				break;
			A = (int) Math.pow(B, 1.0 / N);
			x = (int) Math.pow(Math.floor(A), N);
			y = (int) Math.pow(Math.floor(A + 1), N);
			if (Math.abs(B - x) > Math.abs(B - y))
				sb.append(A + 1);
			else
				sb.append(A);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}