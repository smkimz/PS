import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, K = Integer.parseInt(br.readLine()), x, y, diff, sum = 0;
		if (N <= K) {
			System.out.println(0);
			return;
		}
		PriorityQueue<Integer> sensors = new PriorityQueue<>(),
				distances = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i <= N; i++)
			sensors.add(Integer.parseInt(st.nextToken()));
		x = sensors.poll();
		while (--N >= 0) {
			y = sensors.poll();
			diff = y - x;
			distances.add(diff);
			sum += diff;
			x = y;
		}
		while (--K > 0)
			sum -= distances.poll();
		System.out.println(sum);
	}
}