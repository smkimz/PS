import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y, time = 0;
		PriorityQueue<Cow> cows = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			cows.add(new Cow(x, y));
		}
		Cow cow;
		while (!cows.isEmpty()) {
			cow = cows.poll();
			if (cow.x > time)
				time = cow.x + cow.y;
			else
				time += cow.y;
		}
		System.out.println(time);
	}

	static class Cow implements Comparable<Cow> {
		int x, y;

		public Cow(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Cow o) {
			return Integer.compare(this.x, o.x);
		}
	}
}