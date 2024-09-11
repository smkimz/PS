import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine()), ans = Integer.MAX_VALUE;
		int[] grades = new int[N / 2];
		for (int i = 0; i < N; i++)
			pqueue.add(Integer.parseInt(br.readLine()));
		for (int i = 0; i < N / 2; i++)
			grades[i] = pqueue.poll();
		for (int i = N / 2 - 1; i >= 0; i--) {
			grades[i] += pqueue.poll();
			ans = Math.min(ans, grades[i]);
		}
		System.out.println(ans);
	}
}