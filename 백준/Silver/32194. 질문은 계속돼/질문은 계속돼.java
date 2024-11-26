import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y, a, b;
		int[] A = new int[N + 2];
		char q;
		A[1] = 1;
		for (int i = 2; i <= N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			q = st.nextToken().charAt(0);
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			a = A[y] - A[x - 1];
			b = y - x + 1;
			if ((q == '1' && a == b) || (q == '2' && a == 0)) {
				sb.append("Yes\n");
				A[i] = A[i - 1] + 1;
			} else {
				sb.append("No\n");
				A[i] = A[i - 1];
			}
		}
		System.out.print(sb);
	}
}