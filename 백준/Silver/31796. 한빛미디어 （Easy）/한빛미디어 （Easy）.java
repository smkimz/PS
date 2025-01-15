import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), book, expBook, ans = 1;
		PriorityQueue<Integer> books = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			books.add(Integer.parseInt(st.nextToken()));
		expBook = books.poll();
		while (!books.isEmpty()) {
			book = books.poll();
			if (book * 2 > expBook)
				continue;
			expBook = book;
			++ans;
		}
		System.out.println(ans);
	}
}