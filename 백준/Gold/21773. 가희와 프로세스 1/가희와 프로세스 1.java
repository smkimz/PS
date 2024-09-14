import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Process implements Comparable<Process> {
		int id, time, priority;

		public Process(int id, int time, int priority) {
			this.id = id;
			this.time = time;
			this.priority = priority;
		}

		@Override
		public int compareTo(Process o) {
			if (Integer.compare(this.priority, o.priority) == 0)
				return Integer.compare(this.id, o.id);
			return Integer.compare(this.priority, o.priority);
		}
	}

	static final int MAXPRIORITY = 1_000_000;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), A, B, C;
		PriorityQueue<Process> pq = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			pq.add(new Process(A, B, MAXPRIORITY - C));
		}

		Process p;
		while (--T >= 0) {
			p = pq.poll();
			sb.append(p.id).append("\n");
			if (p.time == 1)
				continue;
			pq.add(new Process(p.id, p.time - 1, p.priority + 1));
		}

		System.out.print(sb);
	}
}