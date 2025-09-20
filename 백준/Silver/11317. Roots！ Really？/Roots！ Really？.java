import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		double a, b, c, s, t, x, p, q;
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Double.parseDouble(st.nextToken());
			b = Double.parseDouble(st.nextToken());
			c = Double.parseDouble(st.nextToken());
			s = Double.parseDouble(st.nextToken());
			t = Double.parseDouble(st.nextToken());
			x = Math.sqrt(Math.pow(b, 2) - (4.0 * a * c));
			p = (-b + x) / (2.0 * a);
			q = (-b - x) / (2.0 * a);
			if ((p >= s && p <= t) || (q >= s && q <= t))
				sb.append("Yes");
			else
				sb.append("No");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}