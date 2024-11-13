import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, h, x, count = 0, ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			x = Integer.parseInt(st.nextToken());
			if (x > h) {
				h = x;
				count = 0;
			} else {
				++count;
				ans = Math.max(ans, count);
			}
		}
		System.out.println(ans);
	}
}