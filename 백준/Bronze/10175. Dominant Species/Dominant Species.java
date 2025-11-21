import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), max, maxIdx;
		char[] str, s = new char[] { 'B', 'C', 'M', 'W' };
		String[] names = new String[] { "Bobcat", "Coyote", "Mountain Lion", "Wolf" };
		int[] vals = new int[128], v = new int[] { 2, 1, 4, 3 }, cnt;
		for (int i = 0; i < 4; i++)
			vals[s[i]] = v[i];
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(": ");
			str = st.nextToken().toCharArray();
			max = 0;
			maxIdx = -1;
			cnt = new int['X'];
			for (int i = 0; i < str.length; i++)
				++cnt[str[i]];
			for (int i = 0; i < 4; i++) {
				cnt[s[i]] *= v[i];
				if (cnt[s[i]] > max) {
					max = cnt[s[i]];
					maxIdx = i;
				} else if (cnt[s[i]] == max)
					maxIdx = -1;
			}
			if (maxIdx == -1)
				sb.append("There is no dominant species\n");
			else
				sb.append("The ").append(names[maxIdx]).append(" is the dominant species\n");
		}
		System.out.print(sb);
	}
}
