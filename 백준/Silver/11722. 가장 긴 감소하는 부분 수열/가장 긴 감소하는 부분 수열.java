import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N], dp = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = arr[0];
		int idx = 0;
		for (int i = 1; i < N; i++) {
			if (dp[idx] > arr[i])
				dp[++idx] = arr[i];
			else
				dp[searchIndex(dp, arr[i])] = arr[i];
		}
		System.out.println(idx + 1);
	}

	static int searchIndex(int[] arr, int val) {
		int start = 0, end = N - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < val)
				end = mid - 1;
			else if (arr[mid] > val)
				start = mid + 1;
			else
				return mid;
		}
		return start;
	}
}
