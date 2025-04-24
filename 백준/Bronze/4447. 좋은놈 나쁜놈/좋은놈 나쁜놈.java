import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), cnt;
		String name;
		while (--N >= 0) {
			name = br.readLine();
			sb.append(name).append(" is ");
			cnt = 0;
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == 'b' || name.charAt(i) == 'B')
					--cnt;
				else if (name.charAt(i) == 'g' || name.charAt(i) == 'G')
					++cnt;
			}
			if (cnt > 0)
				sb.append("GOOD\n");
			else if (cnt < 0)
				sb.append("A BADDY\n");
			else
				sb.append("NEUTRAL\n");
		}
		System.out.print(sb);
	}
}