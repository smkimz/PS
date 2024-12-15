import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), l = (int) (Math.log10(N) / Math.log10(2)), w;
		int[] ans = new int[N + 1],
				pow2 = new int[] { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
		boolean[] tin = new boolean[N + 1];
		for (int i = N; i >= 1; i--) {
			for (int j = l; j >= 0; j--) {
				w = pow2[j] - i;
				if (w >= 1 && w <= N && !tin[w]) {
					ans[i] = w;
					tin[w] = true;
					break;
				}
			}
		}
		for (int i = 1; i <= N; i++)
			sb.append(ans[i]).append("\n");
		System.out.print(sb);
	}
}