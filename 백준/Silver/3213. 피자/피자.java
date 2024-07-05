import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), p, ans = 0;
		int[] count = new int[3];
		HashMap<String, Integer> pizza = new HashMap<String, Integer>();
		pizza.put("1/2", 0);
		pizza.put("1/4", 1);
		pizza.put("3/4", 2);
		while (N-- > 0)
			count[pizza.get(br.readLine())]++;

		p = Math.min(count[1], count[2]);
		count[1] -= p;
		count[2] -= p;
		ans += p;

		p = count[0] / 2;
		count[0] -= p * 2;
		ans += p;

		p = Math.min(count[0], count[1] / 2);
		count[0] -= p;
		count[1] -= p * 2;
		ans += p;

		if (count[0] > 0 && count[1] == 1) {
			count[0] -= 1;
			count[1] -= 1;
			ans += 1;
		}
		if (count[0] > 0)
			ans += Math.ceil(count[0] * 0.5);
		if (count[1] > 0)
			ans += Math.ceil(count[1] * 0.25);
		if (count[2] > 0)
			ans += count[2];

		System.out.println(ans);
	}
}