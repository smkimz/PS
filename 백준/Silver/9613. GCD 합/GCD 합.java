import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N;
		long sum;
		int[] A;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			A = new int[N];
			sum = 0;
			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
				for (int j = i - 1; j >= 0; j--)
					sum += gcd(Math.max(A[i], A[j]), Math.min(A[i], A[j]));
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}