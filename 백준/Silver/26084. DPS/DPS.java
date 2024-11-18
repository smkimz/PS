import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int N = Integer.parseInt(br.readLine());
		long comb, ans = 1;
		long[][] count = new long[2][128];
		while (--N >= 0)
			++count[0][br.readLine().charAt(0)];
		for (int i = 0; i < 3; i++)
			++count[1][S[i]];
		for (int i = 0; i < 3; i++) {
			comb = 1;
			if (count[1][S[i]] == 1)
				comb *= count[0][S[i]];
			else if (count[1][S[i]] == 2)
				comb *= count[0][S[i]] * (count[0][S[i]] - 1) / 2;
			else if (count[1][S[i]] == 3)
				comb *= count[0][S[i]] * (count[0][S[i]] - 1) * (count[0][S[i]] - 2) / 6;
			ans *= comb;
			count[1][S[i]] = 0;
		}
		System.out.println(ans);
	}
}