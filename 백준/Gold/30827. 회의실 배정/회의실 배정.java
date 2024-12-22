import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), s, e, z, ans = 0;
		PriorityQueue<Element> pqueue = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			pqueue.add(new Element(s, e));
		}
		Element[] rooms = new Element[K];
		for (int i = 0; i < K; i++)
			rooms[i] = new Element(0, 0);
		Element a, b;
		while (!pqueue.isEmpty()) {
			a = pqueue.poll();
			b = new Element(0, 0);
			z = -1;
			for (int i = 0; i < K; i++) {
				if (a.start <= rooms[i].end || rooms[i].end < b.end)
					continue;
				b = rooms[i];
				z = i;
			}
			if (z == -1)
				continue;
			rooms[z] = a;
			++ans;
		}
		System.out.println(ans);
	}

	static class Element implements Comparable<Element> {
		int start, end;

		public Element(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Element o) {
			if (Integer.compare(this.end, o.end) == 0)
				return Integer.compare(this.start, o.start);
			return Integer.compare(this.end, o.end);
		}
	}
}