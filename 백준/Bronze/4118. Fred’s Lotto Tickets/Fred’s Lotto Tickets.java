import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N, x, cnt;
		StringTokenizer st;
		boolean[] ck;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			if (N < 9) {
				while (--N >= 0)
					br.readLine();
				sb.append("No\n");
				continue;
			}
			ck = new boolean[50];
			cnt = 0;
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					x = Integer.parseInt(st.nextToken());
					cnt += ck[x] ? 0 : 1;
					ck[x] = true;
				}
			}
			sb.append(cnt == 49 ? "Yes\n" : "No\n");
		}
		System.out.print(sb);
	}
}