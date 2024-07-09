import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), sum = 0, ans = 0, cnt = 0;
		int[] arr = new int[X];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum -= arr[i % X];
			arr[i % X] = Integer.parseInt(st.nextToken());
			sum += arr[i % X];
			if (sum > ans) {
				ans = sum;
				cnt = 1;
			} else if (sum == ans)
				cnt++;
		}
		if (ans == 0) {
			System.out.println("SAD");
			return;
		}
		System.out.printf("%d\n%d", ans, cnt);
	}
}