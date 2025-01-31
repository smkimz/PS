import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] S = new String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         " };
		int N;
		while (st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			for (int i = 0; i < N - 1; i++)
				sb.append(S[i]).append("*").append(S[N - 2 - i]).append(" ").append(S[N - 2 - i]).append("*\n");
			sb.append(S[N - 1]).append("*\n");
		}
		System.out.print(sb);
	}
}