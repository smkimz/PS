import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		double N;
		char x;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Double.parseDouble(st.nextToken());
			while (st.hasMoreTokens()) {
				x = st.nextToken().charAt(0);
				if (x == '@')
					N *= 3.0;
				else if (x == '%')
					N += 5.0;
				else if (x == '#')
					N -= 7.0;
			}
			sb.append(String.format("%.2f\n", N));
		}
		System.out.print(sb);
	}
}