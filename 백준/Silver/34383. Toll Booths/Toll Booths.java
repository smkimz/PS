import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0, q, ans = 0;
		char c;
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			c = st.nextToken().charAt(0);
			q = Integer.parseInt(st.nextToken());
			if (c == 'T') {
				if (X - q >= 0)
					X -= q;
				else {
					ans += q - X;
					X = 0;
				}
			} else
				X += q;
		}
		System.out.println(ans);
	}
}