import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int P = Integer.parseInt(br.readLine());
		int[] ans = new int[5];
		while (--P >= 0) {
			st = new StringTokenizer(br.readLine());
			if (st.nextToken().charAt(0) == '1') {
				++ans[0];
				continue;
			}
			++ans[Integer.parseInt(st.nextToken())];
		}
		System.out.printf("%d\n%d\n%d\n%d", ans[1] + ans[2], ans[3], ans[4], ans[0]);
	}
}
