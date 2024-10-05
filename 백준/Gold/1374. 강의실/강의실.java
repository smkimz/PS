import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), classroom = 0, max = 0;
		PriorityQueue<Lecture> pqueue = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			pqueue.add(new Lecture(Integer.parseInt(st.nextToken()), 1));
			pqueue.add(new Lecture(Integer.parseInt(st.nextToken()), -1));
		}

		while (!pqueue.isEmpty()) {
			classroom += pqueue.poll().v;
			max = Math.max(max, classroom);
		}
		System.out.println(max);
	}

	static class Lecture implements Comparable<Lecture> {
		int time, v;

		public Lecture(int time, int v) {
			this.time = time;
			this.v = v;
		}

		@Override
		public int compareTo(Lecture o) {
			if (this.time == o.time)
				return Integer.compare(this.v, o.v);
			return Integer.compare(this.time, o.time);
		}
	}
}