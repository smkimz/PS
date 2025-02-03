import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), J, M, R, T;
		int[] ans = new int[] { 0, Integer.MAX_VALUE };
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			J = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = (J - 1) % (M + 1);
			J -= R;
			T = ((J + M) / (M + 1)) * 2;
			if (T >= ans[1])
				continue;
			ans[0] = i;
			ans[1] = T;
		}
		System.out.printf("%d %d", ans[0], ans[1]);
	}
}