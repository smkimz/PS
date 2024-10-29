import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), x = 0, y = N;
		long ans = 0;
		int[] T = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			T[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(T);
		for (int i = 0; i < K; i++) {
			if (i % 2 == 0) {
				ans += T[y] - T[x];
				--y;
			} else
				++x;
		}
		System.out.println(ans);
	}
}