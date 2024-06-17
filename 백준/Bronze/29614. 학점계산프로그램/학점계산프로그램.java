import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Double> table = new HashMap<Character, Double>();
		char[] input = br.readLine().toCharArray(), grade = { 'F', 'D', 'C', 'B', 'A' };
		for (int i = 0; i <= 4; i++)
			table.put(grade[i], i * 1.0);
		double ans = 0;
		int cnt = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == '+') {
				ans += 0.5;
				continue;
			}
			ans += table.get(input[i]);
			cnt++;
		}
		System.out.println(ans / cnt);
	}
}
