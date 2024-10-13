import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Participant> pqueue = new PriorityQueue<>();
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			pqueue.add(new Participant(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())));
		}
		System.out.println(pqueue.poll().num);
	}

	static class Participant implements Comparable<Participant> {
		int num, score, count, time;

		public Participant(int num, int score, int count, int time) {
			this.num = num;
			this.score = score;
			this.count = count;
			this.time = time;
		}

		@Override
		public int compareTo(Participant o) {
			if (this.score == o.score) {
				if (this.count == o.count)
					return Integer.compare(this.time, o.time);
				return Integer.compare(this.count, o.count);
			}
			return Integer.compare(o.score, this.score);
		}
	}
}