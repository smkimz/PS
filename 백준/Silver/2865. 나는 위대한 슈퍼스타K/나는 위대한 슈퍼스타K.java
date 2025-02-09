import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = stoi(st.nextToken()), M = stoi(st.nextToken()), K = stoi(st.nextToken()), num;
		double score, totalScore = 0;
		PriorityQueue<Participant> pqueue = new PriorityQueue<>();
		boolean[] participants = new boolean[N + 1];
		Participant p;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				num = stoi(st.nextToken());
				score = stod(st.nextToken());
				pqueue.add(new Participant(num, score));
			}
		}
		while (K > 0) {
			p = pqueue.poll();
			if (participants[p.num])
				continue;
			totalScore += p.score;
			participants[p.num] = true;
			--K;
		}
		System.out.println(Math.round(totalScore * 10) / 10.0);
	}

	static int stoi(String s) {
		return Integer.parseInt(s);
	}

	static double stod(String s) {
		return Double.parseDouble(s);
	}

	static class Participant implements Comparable<Participant> {
		int num;
		double score;

		public Participant(int num, double score) {
			this.num = num;
			this.score = score;
		}

		@Override
		public int compareTo(Participant o) {
			return Double.compare(o.score, this.score);
		}
	}
}