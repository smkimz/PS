import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> map = new HashMap<>();
		int X, maxCount = 0, maxValue = 0, mean = 0;
		for (int i = 0; i < 10; i++) {
			X = Integer.parseInt(br.readLine());
			mean += X;
			map.put(X, map.getOrDefault(X, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxValue = entry.getKey();
			}
		}
		System.out.printf("%d\n%d", mean / 10, maxValue);
	}
}