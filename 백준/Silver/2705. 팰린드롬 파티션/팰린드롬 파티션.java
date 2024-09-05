import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N, max = 1;
		int[] memo = new int[1001];
		memo[1] = 1;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			if (memo[N] == 0) {
				for (int i = max + 1; i <= N; i++) {
					memo[i] = 1;
					for (int j = 1; j <= i / 2; j++)
						memo[i] += memo[j];
				}
				max = N;
			}
			sb.append(memo[N]).append("\n");
		}
		System.out.println(sb);
	}
}
