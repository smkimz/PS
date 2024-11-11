import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), X;
		char[] S;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			S = st.nextToken().toCharArray();
			for (int i = 0; i < X - 1; i++)
				sb.append(S[i]);
			for (int i = X; i < S.length; i++)
				sb.append(S[i]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}