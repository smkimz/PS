import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()),
				H = Integer.parseInt(st.nextToken()), l;
		double max = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		while (--N >= 0) {
			l = Integer.parseInt(br.readLine());
			sb.append(l <= max ? "YES\n" : "NO\n");
		}
		System.out.print(sb);
	}
}