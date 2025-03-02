import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N, M, ans = 0;
		while (true) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0)
				break;
			M /= N;
			st = new StringTokenizer(br.readLine());
			ans = 0;
			while (--N >= 0)
				ans += Math.min(M, Integer.parseInt(st.nextToken()));
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}