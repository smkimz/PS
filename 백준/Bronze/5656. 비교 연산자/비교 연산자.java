import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = 0, a, b;
		String s;
		while (true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			if (s.equals("E"))
				break;
			b = Integer.parseInt(st.nextToken());
			sb.append("Case ").append(++t).append(": ");
			if (s.equals(">"))
				sb.append(a > b ? "true\n" : "false\n");
			else if (s.equals(">="))
				sb.append(a >= b ? "true\n" : "false\n");
			else if (s.equals("<"))
				sb.append(a < b ? "true\n" : "false\n");
			else if (s.equals("<="))
				sb.append(a <= b ? "true\n" : "false\n");
			else if (s.equals("=="))
				sb.append(a == b ? "true\n" : "false\n");
			else if (s.equals("!="))
				sb.append(a != b ? "true\n" : "false\n");
		}
		System.out.print(sb);
	}
}