import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		class Element implements Comparable<Element> {
			int num, val;

			public Element(int num, int val) {
				this.num = num;
				this.val = val;
			}

			@Override
			public int compareTo(Element o) {
				return Integer.compare(this.val, o.val);
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), prev = Integer.MAX_VALUE, coordinate = -1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Element> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++)
			pq.add(new Element(i, Integer.parseInt(st.nextToken())));
		int[] coordinates = new int[N];
		Element e;
		while (!pq.isEmpty()) {
			e = pq.poll();
			if (e.val != prev)
				++coordinate;
			coordinates[e.num] = coordinate;
			prev = e.val;
		}
		for (int i = 0; i < N; i++)
			sb.append(coordinates[i]).append(" ");
		System.out.print(sb);
	}
}