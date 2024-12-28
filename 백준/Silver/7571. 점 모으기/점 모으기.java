import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int M = Integer.parseInt(st.nextToken()), mx, my, ans = 0;
		int[] X = new int[M], Y = new int[M];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(X);
		Arrays.sort(Y);
		mx = X[M / 2];
		my = Y[M / 2];
		for (int i = 0; i < M; i++)
			ans += Math.abs(X[i] - mx) + Math.abs(Y[i] - my);
		System.out.println(ans);
	}
}
