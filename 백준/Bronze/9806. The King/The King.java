import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), P = Integer.parseInt(br.readLine()), x, ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		if (P % 2 == 1) {
			while (--N >= 0) {
				x = Integer.parseInt(st.nextToken());
				if (x <= 0)
					continue;
				ans += Math.pow(x, P);
			}
		} else {
			while (--N >= 0) {
				x = Integer.parseInt(st.nextToken());
				ans += Math.pow(x, P);
			}
		}
		System.out.println(ans);
	}
}