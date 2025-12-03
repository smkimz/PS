import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("\n");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),
				L = Integer.parseInt(st.nextToken()), totalScore, score, team = 0;
		String input;
		boolean a;
		while (--N >= 0) {
			input = new String(br.readLine());
			st = new StringTokenizer(input);
			totalScore = 0;
			a = false;
			while (st.hasMoreTokens()) {
				score = Integer.parseInt(st.nextToken());
				if (score < L) {
					a = true;
					break;
				}
				totalScore += score;
			}
			if (a || totalScore < K)
				continue;
			sb.append(input).append(' ');
			++team;
		}
		sb.insert(0, team);
		System.out.print(sb);
	}
}
