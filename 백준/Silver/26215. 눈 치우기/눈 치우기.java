import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), time = 0, x, y;
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			pqueue.add(Integer.parseInt(st.nextToken()));
		while (!pqueue.isEmpty() && time <= 1440) {
			x = pqueue.poll();
			if (pqueue.isEmpty()) {
				time += x;
				break;
			}
			y = pqueue.poll();
			x -= y;
			time += y;
			if (x != 0)
				pqueue.add(x);
		}
		System.out.println(time >= 1441 || !pqueue.isEmpty() ? -1 : time);
	}
}