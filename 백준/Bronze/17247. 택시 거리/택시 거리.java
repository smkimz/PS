import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x = 0;
		int[][] p = new int[2][2];
		char c;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				c = st.nextToken().charAt(0);
				if (c == '1') {
					p[x][0] = i;
					p[x][1] = j;
					if (++x == 2) {
						System.out.println(Math.abs(p[0][0] - p[1][0]) + Math.abs(p[0][1] - p[1][1]));
						return;
					}
					break;
				}
			}
		}
	}
}
