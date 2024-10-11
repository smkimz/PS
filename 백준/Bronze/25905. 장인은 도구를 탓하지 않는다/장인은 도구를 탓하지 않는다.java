import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Double> probabilities = new PriorityQueue<Double>(Collections.reverseOrder());
		double ans = 1;
		for (int i = 0; i < 10; i++)
			probabilities.add(Double.parseDouble(br.readLine()));
		for (int i = 9; i >= 1; i--)
			ans *= probabilities.poll() / i;
		System.out.println(String.format("%.9f", ans * 1000000000));
	}
}