import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Element implements Comparable<Element> {
		int start, end;

		public Element(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Element o) {
			if (this.end == o.end)
				return Integer.compare(this.start, o.start);
			return Integer.compare(this.end, o.end);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 1;
		PriorityQueue<Element> pq = new PriorityQueue<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(new Element(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		Element x = pq.poll(), y;
		while (!pq.isEmpty()) {
			y = pq.poll();
			if (y.start < x.end)
				continue;
			x = y;
			++ans;
		}
		System.out.println(ans);
	}
}