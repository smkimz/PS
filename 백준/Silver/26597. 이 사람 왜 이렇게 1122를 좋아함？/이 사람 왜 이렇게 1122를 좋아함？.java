import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), ans = 0;
		long max = 1000000000000000001L, min = -1000000000000000001L, x, diff;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Long.parseLong(st.nextToken());
			if (st.nextToken().charAt(0) == '^')
				min = Math.max(min, x);
			else
				max = Math.min(max, x);
			diff = max - min;
			if (diff <= 1) {
				sb.append("Paradox!\n").append(i);
				System.out.print(sb);
				return;
			}
			if (ans == 0 && diff == 2)
				ans = i;
		}
		if (ans > 0)
			System.out.println(sb.append("I got it!\n").append(ans));
		else
			System.out.println(sb.append("Hmm..."));
	}
}