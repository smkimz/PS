import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken()), score = 0, min = 0, max = 0, x = 0;
		M -= K;
		Subject subject;
		PriorityQueue<Subject> pqueue = new PriorityQueue<>();
		HashSet<String> sjName = new HashSet<>();
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			pqueue.add(new Subject(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		while (--K >= 0)
			sjName.add(br.readLine());
		while (!pqueue.isEmpty()) {
			subject = pqueue.poll();
			if (sjName.contains(subject.name)) {
				score += subject.score;
				continue;
			}
			if (x < M) {
				min += subject.score;
				++x;
			}
			deque.add(subject.score);
			if (deque.size() > M)
				deque.poll();
		}
		while (!deque.isEmpty())
			max += deque.poll();
		System.out.printf("%d %d", score + min, score + max);
	}

	static class Subject implements Comparable<Subject> {
		String name;
		int score;

		public Subject(String name, int score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public int compareTo(Subject o) {
			return Integer.compare(this.score, o.score);
		}
	}
}