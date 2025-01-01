import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] cows = new int[11];
		Arrays.fill(cows, -1);
		int N = Integer.parseInt(br.readLine()), x, y, ans = 0;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if (cows[x] != y) {
				if (cows[x] != -1)
					++ans;
				cows[x] = y;
			}
		}
		System.out.println(ans);
	}
}