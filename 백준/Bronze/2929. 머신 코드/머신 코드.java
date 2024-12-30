import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] code = br.readLine().toCharArray();
		int addr = 0, nop, ans = 0;
		for (int i = 0; i < code.length; i++) {
			if (code[i] >= 'A' && code[i] <= 'Z') {
				nop = addr % 4 == 0 ? 0 : 4 - (addr % 4);
				ans += nop;
				addr += nop;
			}
			++addr;
		}
		System.out.println(ans);
	}
}