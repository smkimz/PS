import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), sum = 0, max;
		int[] taste = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			taste[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < K; i++)
			sum += taste[i];
		max = sum;
		for (int i = K; i < N; i++) {
			sum += taste[i] - taste[i - K];
			max = Math.max(max, sum);
		}
		for (int i = 0; i < K - 1; i++) {
			sum += taste[i] - taste[N - K + i];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}