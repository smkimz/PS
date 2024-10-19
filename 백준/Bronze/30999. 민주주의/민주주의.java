import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), cnt, ans = 0;
		char[] str;
		while (--N >= 0) {
			str = br.readLine().toCharArray();
			cnt = 0;
			for (int i = 0; i < M; i++) {
				if (str[i] == 'O')
					++cnt;
			}
			ans += cnt >= Math.ceil(M / 2.0) ? 1 : 0;
		}
		System.out.println(ans);
	}
}