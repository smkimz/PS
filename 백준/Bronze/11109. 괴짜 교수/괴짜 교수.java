import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), d, n, s, p, X, Y;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			X = d + n * p;
			Y = n * s;
			if (X > Y)
				sb.append("do not parallelize");
			else if (X < Y)
				sb.append("parallelize");
			else
				sb.append("does not matter");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}