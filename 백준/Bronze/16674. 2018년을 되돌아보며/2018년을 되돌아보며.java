import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] N = br.readLine().toCharArray(), list = new char[] { '0', '1', '2', '8' };
		int[] cnt = new int[9];
		boolean x, y = false, z = false;
		int ans = 0;
		for (int i = 0; i < N.length; i++) {
			x = false;
			for (int j = 0; j < list.length; j++) {
				if (N[i] == list[j]) {
					++cnt[N[i] - '0'];
					x = true;
					break;
				}
			}
			if (!x) {
				System.out.println(0);
				return;
			}
		}
		for (int i = 0; i < list.length; i++) {
			if (cnt[list[i] - '0'] == 0)
				y = true;
			if (cnt[list[0] - '0'] != cnt[list[i] - '0'])
				z = true;
		}
		if (!y) {
			if (!z)
				ans = 8;
			else
				ans = 2;
		} else
			ans = 1;
		System.out.println(ans);
	}
}