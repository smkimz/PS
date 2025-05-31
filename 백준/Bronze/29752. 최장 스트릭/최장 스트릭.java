import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), S, streak = 0, maxStreak = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			S = Integer.parseInt(st.nextToken());
			if (S == 0) {
				maxStreak = Math.max(streak, maxStreak);
				streak = 0;
				continue;
			}
			++streak;
		}
		System.out.println(Math.max(streak, maxStreak));
	}
}