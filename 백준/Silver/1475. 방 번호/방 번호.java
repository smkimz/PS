import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray();
		int[] cnt = new int[10];
		int ans = 0;
		for (int i = 0; i < N.length; i++)
			cnt[N[i] - '0']++;
		for (int i = 0; i <= 8; i++) {
			if (i == 6)
				continue;
			ans = Math.max(ans, cnt[i]);
		}
		ans = Math.max(ans, (int) (Math.ceil((cnt[6] + cnt[9]) / 2.0) + 0.5));
		System.out.println(ans);
	}
}
