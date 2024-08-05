import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if ((str[i] >= 'A' && str[i] <= 'A' + 12) || (str[i] >= 'a' && str[i] <= 'a' + 12))
				sb.append((char) (str[i] + 13));
			else if ((str[i] >= 'A' + 13 && str[i] <= 'Z') || (str[i] >= 'a' + 13 && str[i] <= 'z' + 12))
				sb.append((char) (str[i] - 13));
			else
				sb.append(str[i]);
		}
		System.out.println(sb);
	}
}