import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		class Point implements Comparable<Point> {
			int x, y;

			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			@Override
			public int compareTo(Point o) {
				if (this.y == o.y)
					return Integer.compare(this.x, o.x);
				return Integer.compare(this.y, o.y);
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		PriorityQueue<Point> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine()), x, y;
		Point p;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			pq.add(new Point(x, y));
		}

		while (!pq.isEmpty()) {
			p = pq.poll();
			sb.append(p.x).append(" ").append(p.y).append("\n");
		}
		System.out.print(sb);
	}
}