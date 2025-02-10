import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), l, c;
		StringBuilder sb = new StringBuilder();
		LinkedList<Character> password;
		char[] keylog;
		while (--T >= 0) {
			password = new LinkedList<>();
			keylog = br.readLine().toCharArray();
			l = 0;
			c = 0;
			for (int i = 0; i < keylog.length; i++) {
				if (keylog[i] == '<') {
					if (c == 0)
						continue;
					--c;
				} else if (keylog[i] == '>') {
					if (c == l)
						continue;
					++c;
				} else if (keylog[i] == '-') {
					if (l == 0 || c == 0)
						continue;
					password.remove(c - 1);
					--c;
					--l;
				} else {
					password.add(c, keylog[i]);
					++c;
					++l;
				}
			}
			for (char p : password)
				sb.append(p);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}