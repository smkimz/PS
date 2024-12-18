import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),
				Q = Integer.parseInt(st.nextToken()), a, x = 0;
		int[] A = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			a = Integer.parseInt(st.nextToken());
			A[i] = A[i - 1];
			if (a == K)
				x = 0;
			else
				A[i] += ++x;
		}
		st = new StringTokenizer(br.readLine());
		while (--Q >= 0)
			sb.append(A[Integer.parseInt(st.nextToken())]).append("\n");
		System.out.print(sb);
	}
}