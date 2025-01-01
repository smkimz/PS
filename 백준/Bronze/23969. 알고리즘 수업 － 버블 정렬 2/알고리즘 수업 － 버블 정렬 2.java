import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), a, X = 0;
		int[] A = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		for (int i = N; i >= 2; i--) {
			for (int j = 1; j <= i - 1; j++) {
				if (A[j] <= A[j + 1])
					continue;
				a = A[j];
				A[j] = A[j + 1];
				A[j + 1] = a;
				++X;
				if (X == K) {
					for (int k = 1; k <= N; k++)
						sb.append(A[k]).append(" ");
					System.out.println(sb);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}