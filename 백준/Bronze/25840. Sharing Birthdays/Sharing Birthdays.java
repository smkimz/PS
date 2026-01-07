import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), day, ans = 0;
		boolean[] days = new boolean[384];
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine(), "/");
			day = (Integer.parseInt(st.nextToken()) - 1) * 32 + Integer.parseInt(st.nextToken());
			if (days[day])
				continue;
			++ans;
			days[day] = true;
		}
		System.out.println(ans);
	}
}
