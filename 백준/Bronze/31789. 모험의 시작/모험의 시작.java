import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X, S, c, p;
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			if (c > X)
				continue;
			p = Integer.parseInt(st.nextToken());
			if (p > S) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}