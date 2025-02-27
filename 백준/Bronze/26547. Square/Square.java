import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l;
		String str, blank;
		while (--N >= 0) {
			str = br.readLine();
			l = str.length() - 1;
			blank = "";
			for (int i = 0; i <= l - 2; i++)
				blank += " ";
			sb.append(str).append("\n");
			if (l == 0)
				continue;
			for (int i = 1; i <= l - 1; i++)
				sb.append(str.charAt(i)).append(blank).append(str.charAt(l - i)).append("\n");
			for (int i = l; i >= 0; i--)
				sb.append(str.charAt(i));
			sb.append("\n");
		}
		System.out.print(sb);
	}
}