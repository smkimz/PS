import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] num = br.readLine().toCharArray();
		boolean isNegative = false;
		int ans = 0, val = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == '-' || num[i] == '+') {
				if (isNegative)
					ans -= val;
				else
					ans += val;
				val = 0;
				if (num[i] == '-')
					isNegative = true;
			} else
				val = val * 10 + (num[i] - '0');
		}
		if (isNegative)
			ans -= val;
		else
			ans += val;
		System.out.println(ans);
	}
}