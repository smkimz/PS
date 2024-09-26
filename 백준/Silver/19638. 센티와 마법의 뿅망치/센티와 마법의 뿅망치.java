import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), H = Integer.parseInt(st.nextToken()),
				T = Integer.parseInt(st.nextToken()), t = T;
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
		while (--N >= 0)
			pqueue.add(Integer.parseInt(br.readLine()));
		while (pqueue.peek() >= H && pqueue.peek() != 1 && --t >= 0)
			pqueue.add((int) Math.floor(pqueue.poll() / 2));
		if (pqueue.peek() < H)
			sb.append("YES\n").append(T - t);
		else
			sb.append("NO\n").append(pqueue.poll());
		System.out.print(sb);
	}
}