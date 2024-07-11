import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> coffeeIndex, coffeeSizes = new HashMap<String, Integer>();
		coffeeSizes.put("small", 0);
		coffeeSizes.put("medium", 1);
		coffeeSizes.put("large", 2);
		int[][] coffeePrice;
		int T = Integer.parseInt(br.readLine()), C, P, deliv, cost;
		String coffee, size;
		while (--T >= 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			deliv = 100 / P;
			coffeeIndex = new HashMap<String, Integer>();
			coffeePrice = new int[C][3];
			for (int i = 0; i < C; i++) {
				st = new StringTokenizer(br.readLine());
				coffeeIndex.put(st.nextToken(), i);
				for (int j = 0; j <= 2; j++)
					coffeePrice[i][j] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < P; i++) {
				st = new StringTokenizer(br.readLine());
				sb.append(st.nextToken()).append(" ");
				size = st.nextToken();
				coffee = st.nextToken();
				cost = deliv + coffeePrice[coffeeIndex.get(coffee)][coffeeSizes.get(size)];
				if (cost % 5 == 1)
					cost--;
				else if (cost % 5 == 4)
					cost++;
				sb.append(cost).append("\n");
			}
		}
		System.out.print(sb);
	}
}