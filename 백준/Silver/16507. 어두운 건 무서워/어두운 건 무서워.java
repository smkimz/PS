import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()),
				Q = Integer.parseInt(st.nextToken()), S, W;
		int[][] B = new int[R + 1][C + 1];
		int[] L = new int[4];
		for (int r = 1; r <= R; r++) {
			st = new StringTokenizer(br.readLine());
			S = 0;
			for (int c = 1; c <= C; c++) {
				S += Integer.parseInt(st.nextToken());
				B[r][c] = B[r - 1][c] + S;
			}
		}
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i <= 3; i++)
				L[i] = Integer.parseInt(st.nextToken());
			W = (L[3] - L[1] + 1) * (L[2] - L[0] + 1);
			sb.append((B[L[2]][L[3]] - B[L[0] - 1][L[3]] - B[L[2]][L[1] - 1] + B[L[0] - 1][L[1] - 1]) / W).append("\n");
		}
		System.out.print(sb);
	}
}