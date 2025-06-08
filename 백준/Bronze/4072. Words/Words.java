import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		char[] str;
		while (true) {
			st = new StringTokenizer(br.readLine());
			if (st.countTokens() == 1) {
				str = st.nextToken().toCharArray();
				if (str.length == 1 && str[0] == '#') {
					System.out.print(sb);
					return;
				}
				for (int i = str.length - 1; i >= 0; i--)
					sb.append(str[i]);
				sb.append(" ");
			}
			while (st.hasMoreTokens()) {
				str = st.nextToken().toCharArray();
				for (int i = str.length - 1; i >= 0; i--)
					sb.append(str[i]);
				sb.append(" ");
			}
			sb.append("\n");
		}
	}
}