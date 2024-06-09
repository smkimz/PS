import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine()), max = 0, w = 0;
		for (int i = 0; i < N; i++)
			pq.add(Integer.parseInt(br.readLine()));
		for (int i = 1; i <= N; i++) {
			w = pq.poll() * i;
			max = Math.max(max, w);
		}
		System.out.println(max);
	}
}
