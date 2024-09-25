import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static class Balloon {
		int num, val;

		public Balloon(int num, int val) {
			this.num = num;
			this.val = val;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Balloon> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
		Balloon b;
		while (true) {
			b = deque.poll();
			sb.append(b.num).append(" ");
			if (deque.isEmpty())
				break;
			if (b.val < 0) {
				for (int i = 0; i > b.val; i--)
					deque.addFirst(deque.pollLast());
			} else {
				for (int i = 0; i < b.val - 1; i++)
					deque.addLast(deque.pollFirst());
			}
		}
		System.out.print(sb);
	}
}