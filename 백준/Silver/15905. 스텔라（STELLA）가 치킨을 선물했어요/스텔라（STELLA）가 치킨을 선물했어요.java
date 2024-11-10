import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), solved, ans = 0;
		StringTokenizer st;
		PriorityQueue<Participant> pqueue = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			pqueue.add(new Participant(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		for (int i = 0; i <= 3; i++)
			pqueue.poll();
		solved = pqueue.poll().solved;
		while (!pqueue.isEmpty() && pqueue.peek().solved == solved) {
			++ans;
			pqueue.poll();
		}
		System.out.println(ans);
	}

	static class Participant implements Comparable<Participant> {
		int solved, panalty;

		public Participant(int solved, int panalty) {
			this.solved = solved;
			this.panalty = panalty;
		}

		@Override
		public int compareTo(Participant o) {
			if (this.solved == o.solved)
				return Integer.compare(this.panalty, o.panalty);
			return Integer.compare(o.solved, this.solved);
		}
	}
}