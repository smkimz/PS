import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int wLeft, wRight;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		char[] str;
		boolean isPalindrome;
		while (--T >= 0) {
			str = br.readLine().toCharArray();
			isPalindrome = checkString(str, 0, str.length - 1, false);
			if (isPalindrome) {
				sb.append(0).append("\n");
				continue;
			}
			isPalindrome = checkString(str, wLeft + 1, wRight, true);
			if (isPalindrome) {
				sb.append(1).append("\n");
				continue;
			}
			isPalindrome = checkString(str, wLeft, wRight - 1, true);
			if (isPalindrome) {
				sb.append(1).append("\n");
				continue;
			}
			sb.append(2).append("\n");
		}
		System.out.print(sb);
	}

	static boolean checkString(char[] str, int left, int right, boolean checker) {
		while (left <= right) {
			if (str[left] != str[right]) {
				if (checker)
					return false;
				wLeft = left;
				wRight = right;
				return false;
			}
			++left;
			--right;
		}
		return true;
	}
}