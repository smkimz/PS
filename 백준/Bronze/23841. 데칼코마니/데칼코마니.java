import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		char[][] P = new char[N][M];
		for (int i = 0; i < N; i++) {
			P[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if (P[i][j] == '.')
					continue;
				P[i][M - j - 1] = P[i][j];
			}
			sb.append(P[i]).append("\n");
		}
		System.out.print(sb);
	}
}