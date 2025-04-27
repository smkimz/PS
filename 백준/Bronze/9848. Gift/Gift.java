import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()) - 1, K = Integer.parseInt(st.nextToken()),
				x = Integer.parseInt(br.readLine()), y, ans = 0;
		while (--N >= 0) {
			y = Integer.parseInt(br.readLine());
			if (x - y >= K)
				++ans;
			x = y;
		}
		System.out.print(ans);
	}
}
