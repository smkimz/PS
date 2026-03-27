import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()), H = Integer.parseInt(st.nextToken()),
				N = Integer.parseInt(br.readLine()), C, B, ans = 0;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			ans += Math.max(C * M, B * H);
		}
		System.out.println(ans);
	}
}