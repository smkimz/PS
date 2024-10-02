import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Double> table = new HashMap<String, Double>();
		String[] scores = { "F", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+" };
		for (int i = 1; i <= 4; i++) {
			table.put(scores[i * 2 - 1], i + 0.0);
			table.put(scores[i * 2], i + 0.5);
		}
		table.put("F", 0.0);
		String[] input;
		double ans = 0;
		int credit = 0;
		for (int i = 0; i < 20; i++) {
			input = br.readLine().split(" ");
			if (input[2].equals("P"))
				continue;
			credit += Double.valueOf(input[1]);
			ans += Double.valueOf(input[1]) * table.get(input[2]);
		}
		System.out.println(ans / credit);
	}
}