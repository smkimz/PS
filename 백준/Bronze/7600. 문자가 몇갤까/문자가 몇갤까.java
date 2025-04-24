import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str;
		boolean[] checker;
		int ans;
		while (true) {
			str = br.readLine().toCharArray();
			checker = new boolean[128];
			ans = 0;
			if (str.length == 1 && str[0] == '#')
				break;
			for (int i = 0; i < str.length; i++)
				checker[str[i]] = true;

			for (int i = 'A'; i <= 'Z'; i++) {
				if (checker[i] || checker[i + 32])
					++ans;
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}