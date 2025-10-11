import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()), cnt;
		char[] wow = new char[] { 'W', 'O', 'W' }, S;
		boolean isWow;
		while (--Q >= 0) {
			S = br.readLine().toCharArray();
			cnt = 0;
			for (int i = 0; i < S.length - 2; i++) {
				isWow = true;
				for (int j = i; j < i + 3; j++) {
					if (S[j] != wow[j - i]) {
						isWow = false;
						break;
					}
				}
				if (isWow)
					++cnt;
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}
