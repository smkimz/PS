import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static class Score {
		int myScore, oppScore, count;

		public Score(int myScore, int oppScore, int count) {
			this.myScore = myScore;
			this.oppScore = oppScore;
			this.count = count;
		}
	}

	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			checkScore(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		System.out.print(sb);
	}

	static void checkScore(int S, int T) {
		Deque<Score> dq = new ArrayDeque<>();
		dq.add(new Score(S, T, 0));
		boolean[] vt = new boolean[301];
		Score s;
		int min = Integer.MAX_VALUE;
		while (!dq.isEmpty()) {
			s = dq.poll();
			if (min <= s.count)
				continue;
			if (s.myScore == s.oppScore) {
				sb.append(s.count).append("\n");
				break;
			}
			if (s.myScore > s.oppScore)
				continue;
			if (!vt[s.myScore + 1])
				dq.add(new Score(s.myScore + 1, s.oppScore, s.count + 1));
			if (!vt[s.myScore * 2])
				dq.add(new Score(s.myScore * 2, s.oppScore + 3, s.count + 1));
		}
	}
}