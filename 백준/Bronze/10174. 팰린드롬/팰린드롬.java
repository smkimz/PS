import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l;
		char[] str;
		boolean p;
		while (--N >= 0) {
			str = br.readLine().toLowerCase().toCharArray();
			l = str.length - 1;
			p = false;
			for (int i = 0; i <= l / 2; i++) {
				if (str[i] != str[l - i]) {
					p = true;
					break;
				}
			}
			if (p)
				sb.append("No\n");
			else
				sb.append("Yes\n");
		}
		System.out.print(sb);
	}
}
