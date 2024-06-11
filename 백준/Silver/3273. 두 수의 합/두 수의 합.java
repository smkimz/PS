import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(nums);
		int X = Integer.parseInt(br.readLine());
		int mid, start, end, target, ans = 0;
		for (int i = 0; i < N - 1; i++) {
			start = i + 1;
			end = N - 1;
			target = X - nums[i];
			while (start <= end) {
				mid = (start + end) / 2;
				if (target > nums[mid])
					start = mid + 1;
				else if (target < nums[mid])
					end = mid - 1;
				else {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
