import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] dl = new boolean[101];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M, ans = 0;
		while (--N >= 0)
			dl[Integer.parseInt(st.nextToken())] = true;
		M = Integer.parseInt(br.readLine());
		boolean f;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			f = false;
			while (--N >= 0) {
				if (dl[Integer.parseInt(st.nextToken())]) {
					f = true;
					break;
				}
			}
			if (f)
				continue;
			++ans;
		}
		System.out.println(ans);
	}
}