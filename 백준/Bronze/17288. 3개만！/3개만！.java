import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int len = 1, ans = 0;
		for (int i = 1; i < S.length; i++) {
			if (S[i] - S[i - 1] == 1) {
				++len;
				continue;
			}
			if (len == 3)
				++ans;
			len = 1;
		}
		System.out.println(len == 3 ? ans + 1 : ans);
	}
}