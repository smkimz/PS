import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray(), kick = new char[] { 'k', 'i', 'c', 'k' };
		int x = 0, ans = 0;
		for (int i = 0; i < str.length - 3; i++) {
			if (str[i] != 'k')
				continue;
			for (x = 1; x < 4; x++) {
				if (str[i + x] != kick[x])
					break;
			}
			if (x == 4)
				++ans;
		}
		System.out.println(ans);
	}
}