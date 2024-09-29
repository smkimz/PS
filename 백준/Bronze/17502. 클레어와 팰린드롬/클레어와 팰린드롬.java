import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()) - 1;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i <= N; i++) {
			if (str[i] != '?')
				sb.append(str[i]);
			else if (str[N - i] == '?')
				sb.append('a');
			else
				sb.append(str[N - i]);
		}
		System.out.print(sb);
	}
}