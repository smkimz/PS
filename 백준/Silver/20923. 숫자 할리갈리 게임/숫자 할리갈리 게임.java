import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static ArrayDeque<Integer>[] deque = new ArrayDeque[2], ground = new ArrayDeque[2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x, y;
		String[] name = new String[] { "do", "su" };
		for (int i = 0; i <= 1; i++) {
			deque[i] = new ArrayDeque<>();
			ground[i] = new ArrayDeque<>();
		}
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			deque[0].add(Integer.parseInt(st.nextToken()));
			deque[1].add(Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < M; i++) {
			x = i % 2;
			y = (x + 1) % 2;
			ground[x].addLast(deque[x].pollLast());
			if (deque[x].isEmpty()) {
				System.out.println(name[y]);
				return;
			}
			if (ground[x].peekLast() == 5)
				cleanUpGround(0, 1);
			else if (!ground[y].isEmpty() && ground[x].peekLast() + ground[y].peekLast() == 5)
				cleanUpGround(1, 0);
		}
		if (deque[0].size() > deque[1].size())
			System.out.println("do");
		else if (deque[0].size() < deque[1].size())
			System.out.println("su");
		else
			System.out.println("dosu");
	}

	static void cleanUpGround(int i, int j) {
		while (!ground[j].isEmpty())
			deque[i].addFirst(ground[j].pollFirst());
		while (!ground[i].isEmpty())
			deque[i].addFirst(ground[i].pollFirst());
	}
}