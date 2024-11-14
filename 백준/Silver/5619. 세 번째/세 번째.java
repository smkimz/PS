import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a, size;
		long x, y;
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Long> combined = new PriorityQueue<>();
		long[] nums = new long[4];
		while (--N >= 0) {
			a = Integer.parseInt(br.readLine());
			if (pqueue.size() < 4)
				pqueue.add(a);
			else if (a < pqueue.peek()) {
				pqueue.poll();
				pqueue.add(a);
			}
		}
		size = pqueue.size() - 1;
		for (int i = size; i >= 0; i--)
			nums[i] = pqueue.poll();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j <= size; j++) {
				x = nums[i];
				y = nums[j];
				combined.add(Long.parseLong(String.valueOf(x) + String.valueOf(y)));
				combined.add(Long.parseLong(String.valueOf(y) + String.valueOf(x)));
			}
		}
		for (int i = 0; i <= 1; i++)
			combined.poll();
		System.out.println(combined.peek());
	}
}