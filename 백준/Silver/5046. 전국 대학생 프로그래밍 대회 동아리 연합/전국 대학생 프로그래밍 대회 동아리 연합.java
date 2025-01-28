import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()),
				H = Integer.parseInt(st.nextToken()), p, a, min = 500001;
		while (--H >= 0) {
			p = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			if (p * N > B || p >= min)
				continue;
			while (st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				if (a >= N) {
					min = p;
					break;
				}
			}
		}
		System.out.println(min > 500000 ? "stay home" : min * N);
	}
}