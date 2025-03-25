import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] str;
		while (--N >= 0) {
			str = br.readLine().toCharArray();
			for (int i = 0; i < str.length - 1; i++) {
				if ((str[i] == 'O' && str[i + 1] == 'I') || (str[i] == '0' && str[i + 1] == '1')) {
					++ans;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}