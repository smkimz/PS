import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()), k;
		long[] a = new long[3];
		long x, y;
		p: while (--n >= 0) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if (k <= 2) {
				for (int i = 0; i < k; i++)
					st.nextToken();
				sb.append("YES\n");
				continue;
			}
			a[0] = Long.parseLong(st.nextToken());
			a[1] = Long.parseLong(st.nextToken());
			a[2] = a[0] + a[1];
			for (int i = 2; i < k; i++) {
				x = Long.parseLong(st.nextToken());
				y = a[(i - 1) % 3] + a[(i - 2) % 3];
				if (x != y) {
					sb.append("NO\n");
					continue p;
				}
				a[i % 3] = y;
			}
			sb.append("YES\n");
		}
		System.out.print(sb);
	}
}