import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int cnt = 0;
		HashMap<String, Boolean> check = new HashMap<String, Boolean>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String topping;
		while (st.hasMoreTokens() && cnt < 4) {
			topping = st.nextToken();
			if (!topping.endsWith("Cheese") || check.getOrDefault(topping, false))
				continue;
			check.put(topping, true);
			cnt++;
		}
		if (cnt == 4)
			System.out.println("yummy");
		else
			System.out.println("sad");
	}
}
