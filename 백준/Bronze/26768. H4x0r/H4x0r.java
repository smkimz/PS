import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] dict = new char[128], str = br.readLine().toCharArray();
		for (int i = 'a'; i <= 'z'; i++)
			dict[i] = (char) i;
		dict['a'] = '4';
		dict['e'] = '3';
		dict['i'] = '1';
		dict['o'] = '0';
		dict['s'] = '5';
		for (int i = 0; i < str.length; i++)
			sb.append(dict[str[i]]);
		System.out.print(sb);
	}
}