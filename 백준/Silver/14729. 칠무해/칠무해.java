import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine());
		Double input;
		while (N-- > 0) {
			input = Double.parseDouble(br.readLine());
			if (pq.size() >= 7 && input < pq.peek()) {
				pq.poll();
				pq.add(input);
			} else if (pq.size() < 7)
				pq.add(input);
		}

		double[] temp = new double[7];
		for (int i = 0; i < 7; i++)
			temp[i] = pq.poll();
		for (int i = 6; i >= 0; i--)
			System.out.printf("%.3f\n", temp[i]);
	}
}
