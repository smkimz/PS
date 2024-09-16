import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	static class Element implements Comparable<Element> {
		int val, abs;

		public Element(int val) {
			this.val = val;
			this.abs = Math.abs(val);
		}

		@Override
		public int compareTo(Element o) {
			if (Integer.compare(this.abs, o.abs) == 0)
				return Integer.compare(this.val, o.val);
			return Integer.compare(this.abs, o.abs);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Element> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine()), X;
		while (--N >= 0) {
			X = Integer.parseInt(br.readLine());
			if (X == 0) {
				if (pq.isEmpty())
					sb.append(0);
				else
					sb.append(pq.poll().val);
				sb.append("\n");
			} else
				pq.add(new Element(X));
		}
		System.out.print(sb);
	}
}