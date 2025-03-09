import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] < 'a' || str[i] > 'z') {
				sb.append(str[i]);
				continue;
			}
			sb.append((char) ((str[i] - 'a' + (26 - K++)) % 26 + 'a'));
			if (K == 26)
				K = 1;
		}
		System.out.println(sb);
	}
}