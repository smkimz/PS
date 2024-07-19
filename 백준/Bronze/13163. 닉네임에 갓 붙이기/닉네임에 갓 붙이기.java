import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			sb.append("god");
			while (st.hasMoreTokens())
				sb.append(st.nextToken());
			sb.append("\n");
		}
		System.out.print(sb);
	}
}