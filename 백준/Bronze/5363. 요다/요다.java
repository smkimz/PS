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
		String A, B;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			A = st.nextToken();
			B = st.nextToken();
			while (st.hasMoreTokens())
				sb.append(st.nextToken()).append(" ");
			sb.append(A).append(" ").append(B).append("\n");
		}
		System.out.print(sb);
	}
}