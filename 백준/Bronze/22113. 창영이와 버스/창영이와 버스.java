import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x, y, ans = 0;
		int[] transfer = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M - 1; i++) {
			y = Integer.parseInt(st.nextToken());
			transfer[x] = y;
			x = y;
		}
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			if (transfer[i] == 0)
				continue;
			for (int j = 0; j < transfer[i] - 1; j++)
				st.nextToken();
			ans += Integer.parseInt(st.nextToken());
		}
		System.out.println(ans);
	}
}