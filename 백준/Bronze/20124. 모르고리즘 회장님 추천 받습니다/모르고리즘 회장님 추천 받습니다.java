import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), B, y = 0;
		String A, x = "zzzzzzzzzz";
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			A = st.nextToken();
			B = Integer.parseInt(st.nextToken());
			if (B > y || (B == y && A.compareTo(x) < 0)) {
				x = A;
				y = B;
				continue;
			}
		}
		System.out.println(x);
	}
}