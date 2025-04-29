import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] countArr = new int[128];
		int N = Integer.parseInt(br.readLine()), ret = 0;
		char[] password = br.readLine().toCharArray();
		for (int i = 0; i < N; i++)
			++countArr[password[i]];
		if (!checkPassword('0', '9', countArr))
			++ret;
		if (!checkPassword('a', 'z', countArr))
			++ret;
		if (!checkPassword('A', 'Z', countArr))
			++ret;
		if (!checkSpecialCharacter(countArr))
			++ret;
		if (N + ret < 6)
			System.out.println(6 - N);
		else
			System.out.println(ret);
	}

	static boolean checkPassword(int start, int end, int[] countArr) {
		for (int i = start; i <= end; i++) {
			if (countArr[i] > 0)
				return true;
		}
		return false;
	}

	static boolean checkSpecialCharacter(int[] countArr) {
		char[] sc = new char[] { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };
		for (int i = 0; i < sc.length; i++) {
			if (countArr[sc[i]] > 0)
				return true;
		}
		return false;
	}
}
