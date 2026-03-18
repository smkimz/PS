import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, a, b, x = 0, ans = 0;
		boolean isUphill = false;
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			b = Integer.parseInt(st.nextToken());
			if (isUphill) {
				if (b - a > 0)
					ans = Math.max(ans, b - x);
				else
					isUphill = false;
			} else if (!isUphill && b - a > 0) {
				isUphill = true;
				x = a;
				ans = Math.max(ans, b - x);
			}
			a = b;
		}
		System.out.println(ans);
	}
}