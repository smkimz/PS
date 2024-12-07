import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), m, x = 120001, y = 0, f = 0, ret = 0, year, month;
		String[] date;
		int[] calendar = new int[120002];
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			date = st.nextToken().split("-");
			m = Integer.parseInt(date[0]) * 12 + Integer.parseInt(date[1]);
			++calendar[m];
			x = Math.min(x, m);
			date = st.nextToken().split("-");
			m = Integer.parseInt(date[0]) * 12 + Integer.parseInt(date[1]) + 1;
			--calendar[m];
			y = Math.max(y, m);
		}
		for (int i = x; i <= y; i++) {
			calendar[i] += calendar[i - 1];
			if (calendar[i] <= f)
				continue;
			f = calendar[i];
			ret = i;
		}
		year = ret % 12 == 0 ? ret / 12 - 1 : ret / 12;
		month = ret % 12 == 0 ? 12 : ret % 12;
		System.out.printf("%d-%02d", year, month);
	}
}