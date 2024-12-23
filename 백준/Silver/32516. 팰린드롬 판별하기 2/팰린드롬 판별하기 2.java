import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), r, ans = 0;
		char[] T = br.readLine().toCharArray();
		for (int i = 0; i < N / 2; i++) {
			r = N - i - 1;
			if (T[i] == '?' && T[r] == '?')
				ans += 26;
			else if (T[i] == '?' || T[r] == '?')
				ans += 1;
			else if (T[i] != T[r]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans);
	}
}