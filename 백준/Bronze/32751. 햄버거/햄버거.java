import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] cnt = new int[4];
		for (int i = 0; i < 4; i++)
			cnt[i] = Integer.parseInt(st.nextToken());
		char[] hbg = br.readLine().toCharArray();
		if (N == 1 && hbg[0] == 'a' && cnt[0] > 0) {
			System.out.println("Yes");
			return;
		}
		if (hbg[0] != 'a' || hbg[0] == hbg[1] || cnt[0] == 0) {
			System.out.println("No");
			return;
		}
		--cnt[0];
		for (int i = 1; i < N - 1; i++) {
			if (hbg[i] == hbg[i + 1] || cnt[hbg[i] - 'a'] == 0) {
				System.out.println("No");
				return;
			}
			--cnt[hbg[i] - 'a'];
		}
		if (hbg[N - 1] != 'a' || cnt[0] == 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
