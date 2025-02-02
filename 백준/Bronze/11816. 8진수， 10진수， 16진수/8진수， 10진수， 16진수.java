import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		if (X.charAt(0) == '0') {
			int d, a, l = X.length(), ans = 0;
			int[] nums = new int[128];
			for (int i = '1'; i <= '9'; i++)
				nums[i] = i - '0';
			for (int i = 'a'; i <= 'f'; i++)
				nums[i] = i - 'a' + 10;
			if (X.charAt(1) == 'x') {
				d = 16;
				a = 2;
			} else {
				d = 8;
				a = 1;
			}
			while (a < l) {
				ans += nums[X.charAt(a)] * Math.pow(d, l - a - 1);
				++a;
			}
			System.out.println(ans);
		} else
			System.out.println(X);
	}
}