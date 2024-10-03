import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), input, max = -Integer.MAX_VALUE, min = Integer.MAX_VALUE, sum = 0;
		int[] counter = new int[8001];
		for (int i = 0; i < N; i++) {
			input = Integer.parseInt(br.readLine()) + 4000;
			++counter[input];
			max = Math.max(max, input);
			min = Math.min(min, input);
			sum += input - 4000;
		}
		int idx = 0, val = -1, cnt = 0, mid = 0;
		boolean isSecond = false, isMid = false;
		for (int i = min; i <= max; i++) {
			if (!isMid) {
				cnt += counter[i];
				if (cnt > N / 2) {
					mid = i;
					isMid = true;
				}
			}
			if (counter[i] < val)
				continue;
			if (counter[i] > val) {
				isSecond = false;
				val = counter[i];
				idx = i;
			} else if (counter[i] == val && !isSecond) {
				isSecond = true;
				idx = i;
			}
		}
		System.out.println(sb.append((int) Math.round(sum / (N * 1.0))).append("\n").append(mid - 4000).append("\n")
				.append(idx - 4000).append("\n").append(max - min));
	}
}