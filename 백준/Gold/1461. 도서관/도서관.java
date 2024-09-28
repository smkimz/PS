import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> leftBooks = new PriorityQueue<>(),
				rightBooks = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), book, maxDist = 0, ans = 0;
		st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			book = Integer.parseInt(st.nextToken());
			maxDist = Math.max(maxDist, Math.abs(book));
			if (book < 0)
				leftBooks.add(book);
			else
				rightBooks.add(book);
		}
		while (!leftBooks.isEmpty()) {
			ans += leftBooks.poll() * -2;
			for (int i = 0; i < M - 1 && !leftBooks.isEmpty(); i++)
				leftBooks.poll();
		}
		while (!rightBooks.isEmpty()) {
			ans += rightBooks.poll() * 2;
			for (int i = 0; i < M - 1 && !rightBooks.isEmpty(); i++)
				rightBooks.poll();
		}
		System.out.println(ans - maxDist);
	}
}