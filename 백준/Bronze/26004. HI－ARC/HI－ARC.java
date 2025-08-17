import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int['Z' + 1];
		int N = Integer.parseInt(br.readLine()), ans = 100000;
		char[] S = br.readLine().toCharArray(), hiarc = new char[] { 'H', 'I', 'A', 'R', 'C' };
		for (int i = 0; i < N; i++)
			++cnt[S[i]];
		for (int i = 0; i < 5; i++)
			ans = Math.min(ans, cnt[hiarc[i]]);
		System.out.println(ans);
	}
}