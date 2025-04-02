import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] S = new int[4], N = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++)
			S[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++)
			N[i] = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(br.readLine()), cookieCount = 0, cmd, i, min;
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			cmd = Integer.parseInt(st.nextToken());
			i = Integer.parseInt(st.nextToken());
			if (cmd >= 2) {
				S[cmd - 2] += i;
				sb.append(S[cmd - 2]).append("\n");
			} else {
				min = Integer.MAX_VALUE;
				for (int x = 0; x < 4; x++)
					min = Math.min(min, S[x] / N[x]);
				if (min >= i) {
					cookieCount += i;
					sb.append(cookieCount).append("\n");
					for (int x = 0; x < 4; x++)
						S[x] -= N[x] * i;
				} else
					sb.append("Hello, siumii\n");
			}
		}
		System.out.print(sb);
	}
}