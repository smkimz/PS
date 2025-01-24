import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()), flag, idx, cnt, ans = 0;
		char[][] cmd = { {}, { 'f', 'o', 'r' }, { 'w', 'h', 'i', 'l', 'e' } };
		int[] cmdLen = { 0, 3, 5 };
		char[] code;
		while (--C >= 0) {
			code = br.readLine().toCharArray();
			flag = 0;
			idx = 0;
			cnt = 0;
			for (int i = 0; i < code.length; i++) {
				if (flag != 0) {
					if (code[i] == cmd[flag][idx]) {
						++idx;
						if (idx != cmdLen[flag])
							continue;
						++cnt;
					}
					flag = 0;
					idx = 0;
				}
				if (code[i] == cmd[1][0]) {
					flag = 1;
					++idx;
				} else if (code[i] == cmd[2][0]) {
					flag = 2;
					++idx;
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}