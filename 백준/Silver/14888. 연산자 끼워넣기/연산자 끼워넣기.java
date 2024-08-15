import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] nums, signCount = new int[4], usedSignCount = new int[4];
	static int N;
	static long min = Integer.MAX_VALUE, max = -Integer.MAX_VALUE;
	static char[] signs;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++)
			signCount[i] = Integer.parseInt(st.nextToken());
		backTracking(nums[0], 1);
		sb.append(max).append("\n").append(min);
		System.out.println(sb);
	}

	static void backTracking(long val, int idx) {
		if (idx == N) {
			max = Math.max(max, val);
			min = Math.min(min, val);
			return;
		}
		for (int i = 0; i <= 3; i++) {
			if (usedSignCount[i] >= signCount[i])
				continue;
			++usedSignCount[i];
			switch (i) {
			case 0:
				backTracking(val + nums[idx], idx + 1);
				break;
			case 1:
				backTracking(val - nums[idx], idx + 1);
				break;
			case 2:
				backTracking(val * nums[idx], idx + 1);
				break;
			case 3:
				backTracking(val / nums[idx], idx + 1);
				break;
			default:
				break;
			}
			--usedSignCount[i];
		}
	}
}