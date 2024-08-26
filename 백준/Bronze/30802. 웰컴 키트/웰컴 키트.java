import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stA = new StringTokenizer(br.readLine());
		StringTokenizer stB = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stB.nextToken()), P = Integer.parseInt(stB.nextToken());
		int[] ans = { 0, N / P, N % P };
		while (stA.hasMoreTokens())
			ans[0] += Math.ceil(Double.parseDouble(stA.nextToken()) / T);
		System.out.printf("%d\n%d %d", ans[0], ans[1], ans[2]);
	}
}