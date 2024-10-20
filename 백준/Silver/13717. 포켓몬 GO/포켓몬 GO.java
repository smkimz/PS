import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), K, M, x, y, maxEv = -1, totalEv = 0;
		String name, maxName = "";
		while (--N >= 0) {
			name = br.readLine();
			st = new StringTokenizer(br.readLine());
			K = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			y = 0;
			while (K <= M) {
				x = M / K;
				M -= K * x - 2 * x;
				y += x;
			}
			totalEv += y;
			if (y <= maxEv)
				continue;
			maxName = name;
			maxEv = y;
		}
		System.out.printf("%d\n%s", totalEv, maxName);
	}
}