import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), max;
		char c = ' ';
		boolean s;
		char[] str;
		int[] cnt;
		while (--T >= 0) {
			str = br.readLine().toCharArray();
			cnt = new int[128];
			for (int i = 0; i < str.length; i++)
				++cnt[str[i]];
			max = 0;
			s = false;
			for (int i = 'a'; i <= 'z'; i++) {
				if (cnt[i] == ' ')
					continue;
				if (max < cnt[i]) {
					max = cnt[i];
					c = (char) i;
					s = false;
				} else if (max == cnt[i])
					s = true;
			}
			if (!s)
				sb.append(c);
			else
				sb.append('?');
			sb.append("\n");
		}
		System.out.print(sb);
	}
}