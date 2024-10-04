import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final int MAX = 1001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], dp = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = MAX;
		}
		dp[0] = arr[0];
		for (int i = 1; i < N; i++) {
			if (dp[idx] < arr[i])
				dp[++idx] = arr[i];
			else
				dp[searchIndex(dp, arr[i], N)] = arr[i];
		}
		System.out.println(idx + 1);
	}

	private static int searchIndex(int[] dp, int val, int size) {
		int start = 0, end = size - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (dp[mid] > val)
				end = mid - 1;
			else if (dp[mid] < val)
				start = mid + 1;
			else
				return mid;
		}
		return start;
	}
}