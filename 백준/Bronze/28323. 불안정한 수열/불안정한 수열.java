import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, x, y, ans = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			y = Integer.parseInt(st.nextToken());
			if (x % 2 == y % 2)
				continue;
			x = y;
			++ans;
		}
		System.out.println(ans);
	}
}