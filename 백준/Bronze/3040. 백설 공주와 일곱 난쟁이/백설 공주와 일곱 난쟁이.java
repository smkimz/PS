import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] nums = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		for (int i = 0; i < 8; i++) {
			sum -= nums[i];
			for (int j = i + 1; j < 9; j++) {
				sum -= nums[j];
				if (sum != 100) {
					sum += nums[j];
					continue;
				}
				for (int k = 0; k < 9; k++) {
					if (k == i || k == j)
						continue;
					sb.append(nums[k]).append("\n");
				}
				System.out.print(sb);
				return;
			}
			sum += nums[i];
		}
	}
}