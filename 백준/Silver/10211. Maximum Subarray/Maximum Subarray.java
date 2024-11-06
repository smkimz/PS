import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, max;
		int[] arr;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[N + 1];
			max = Integer.MIN_VALUE;
			for (int i = 1; i <= N; i++) {
				arr[i] += arr[i - 1] + Integer.parseInt(st.nextToken());
				for (int j = 0; j < i; j++)
					max = Math.max(max, arr[i] - arr[j]);
			}
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
}