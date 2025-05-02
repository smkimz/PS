import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		sb.append(str[0]);
		for (int i = 1; i < str.length; i++) {
			if (str[i] != str[i - 1])
				sb.append(str[i]);
		}
		System.out.println(sb);
	}
}
