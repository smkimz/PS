import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray(), korea = { 'K', 'O', 'R', 'E', 'A' };
		int ans = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] != korea[ans % 5])
				continue;
			ans++;
		}
		System.out.println(ans);
	}
}
