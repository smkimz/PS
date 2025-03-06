import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), L, count = 0;
		char[] S;
		boolean isNotPalindrome;
		while (--N >= 0) {
			S = br.readLine().toCharArray();
			L = S.length - 1;
			isNotPalindrome = false;
			for (int i = 0; i <= L / 2; i++) {
				if (S[i] != S[L - i]) {
					isNotPalindrome = true;
					break;
				}
			}
			if (!isNotPalindrome)
				++count;
		}
		System.out.println(count * (count - 1));
	}
}