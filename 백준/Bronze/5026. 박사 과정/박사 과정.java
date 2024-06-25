import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), "+");
			if (st.countTokens() == 1)
				sb.append("skipped");
			else
				sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
