import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 1, val;
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		while (--N >= 0)
			pqueue.add(Integer.parseInt(st.nextToken()));
		while (!pqueue.isEmpty()) {
			val = pqueue.poll();
			if (val > max)
				break;
			max += val;
		}
		System.out.println(max);
	}
}