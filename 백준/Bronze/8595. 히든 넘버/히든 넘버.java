import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), hnum = 0;
		long ans = 0;
		char[] num = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			if (num[i] >= '0' && num[i] <= '9') {
				hnum = (hnum * 10) + (num[i] - '0');
				continue;
			}
			ans += hnum;
			hnum = 0;
		}
		ans += hnum;
		System.out.println(ans);
	}
}