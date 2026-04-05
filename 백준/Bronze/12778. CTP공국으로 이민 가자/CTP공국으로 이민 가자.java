import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), M, x;
		char N, c;
		StringTokenizer st;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = st.nextToken().charAt(0);
			st = new StringTokenizer(br.readLine());
			if (N == 'C') {
				while (--M >= 0) {
					c = st.nextToken().charAt(0);
					sb.append((int) (c - 64)).append(' ');
				}
			} else {
				while (--M >= 0) {
					x = Integer.parseInt(st.nextToken());
					sb.append((char) (64 + x)).append(' ');
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}