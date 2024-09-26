import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, y, z, sum = 0;
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		while (--N >= 0)
			pqueue.add(Integer.parseInt(br.readLine()));
		while (pqueue.size() > 1) {
			x = pqueue.poll();
			y = pqueue.poll();
			z = x + y;
			sum += z;
			pqueue.add(z);
		}
		System.out.println(sum);
	}
}