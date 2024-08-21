import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String[] strs = new String[25];
		int N = Integer.parseInt(br.readLine()), cnt;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			cnt = st.countTokens();
			for (int j = 0; j < cnt; j++)
				strs[j] = st.nextToken();
			sb.append("Case #").append(i).append(": ");
			for (int j = cnt - 1; j >= 0; j--)
				sb.append(strs[j]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}