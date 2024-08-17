import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] dots = new int[2][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			dots[0][i] = Integer.parseInt(st.nextToken());
			dots[1][i] = Integer.parseInt(st.nextToken());
		}
		int Q = Integer.parseInt(br.readLine()), L, R, X, Y;
		double K;
		while (--Q >= 0) {
			K = Double.parseDouble(br.readLine());
			L = 0;
			R = N - 1;
			if (K > dots[0][R] || K < dots[0][L]) {
				sb.append(0).append("\n");
				continue;
			}
			while (L <= R) {
				X = (L + R) / 2;
				Y = (L + R) / 2 + 1;
				if (dots[0][X] > K) {
					R = X;
					continue;
				}
				if (dots[0][Y] < K) {
					L = X;
					continue;
				}
				if (dots[0][X] == K || dots[0][Y] == K || dots[1][X] == dots[1][Y])
					sb.append(0).append("\n");
				else if (dots[1][X] > dots[1][Y])
					sb.append(-1).append("\n");
				else if (dots[1][X] < dots[1][Y])
					sb.append(1).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}