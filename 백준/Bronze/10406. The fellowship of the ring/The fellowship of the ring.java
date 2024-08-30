import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()),
				P = Integer.parseInt(st.nextToken()), H, ans = 0;
		st = new StringTokenizer(br.readLine());
		while (--P >= 0) {
			H = Integer.parseInt(st.nextToken());
			if (H >= W && H <= N)
				++ans;
		}
		System.out.println(ans);
	}
}