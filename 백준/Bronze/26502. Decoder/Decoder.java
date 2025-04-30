import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] codes = new char[128], str;
		for (int i = 0; i < 128; i++)
			codes[i] = (char) i;
		codes['y'] = 'a';
		codes['a'] = 'e';
		codes['e'] = 'i';
		codes['i'] = 'o';
		codes['o'] = 'u';
		codes['u'] = 'y';
		codes['Y'] = 'A';
		codes['A'] = 'E';
		codes['E'] = 'I';
		codes['I'] = 'O';
		codes['O'] = 'U';
		codes['U'] = 'Y';
		int N = Integer.parseInt(br.readLine());
		while (--N >= 0) {
			str = br.readLine().toCharArray();
			for (int i = 0; i < str.length; i++)
				sb.append(codes[str[i]]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
