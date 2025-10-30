import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), d;
		StringTokenizer st;
		char[] X, Y;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			X = st.nextToken().toCharArray();
			Y = st.nextToken().toCharArray();
			sb.append("Distances: ");
			for (int i = 0; i < X.length; i++) {
				d = Y[i] - X[i];
				if (X[i] <= Y[i])
					sb.append(d);
				else
					sb.append(26 + d);
				sb.append(' ');
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
