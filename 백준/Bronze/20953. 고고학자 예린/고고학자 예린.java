import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), X, Y;
		while (--T >= 0) {
			X = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens())
				X += Integer.parseInt(st.nextToken());
			Y = X * (X - 1) / 2;
			sb.append(X * Y).append("\n");
		}
		System.out.print(sb);
	}
}