import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray(), T = br.readLine().toCharArray();
		int start = 0, end = T.length - 1;
		boolean isStart = false;
		while (end - start + 1 != S.length) {
			if (!isStart) {
				if (T[end] == 'B')
					isStart = true;
				--end;
			} else {
				if (T[start] == 'B')
					isStart = false;
				++start;
			}
		}
		if (!isStart) {
			for (int i = 0; i < S.length; i++) {
				if (S[i] == T[start + i])
					continue;
				System.out.println(0);
				return;
			}
		} else {
			for (int i = 0; i < S.length; i++) {
				if (S[i] == T[end - i])
					continue;
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}