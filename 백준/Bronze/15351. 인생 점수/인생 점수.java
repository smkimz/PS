import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l, score;
		char[] enjoy;
		while (--N >= 0) {
			enjoy = br.readLine().toCharArray();
			l = 0;
			score = 0;
			for (int i = 0; i < enjoy.length; i++) {
				if (enjoy[i] == ' ')
					continue;
				++l;
				score += enjoy[i];
			}
			score -= l * 64;
			if (score == 100)
				sb.append("PERFECT LIFE");
			else
				sb.append(score);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}