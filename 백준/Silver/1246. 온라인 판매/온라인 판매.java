import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), totalPrice, price = 0, max = 0;
		int[] P = new int[M];
		for (int i = 0; i < M; i++)
			P[i] = Integer.parseInt(br.readLine());
		Arrays.sort(P);
		N = M - N < 0 ? 0 : M - N;
		for (int i = N; i < M; i++) {
			totalPrice = P[i] * (M - i);
			if (totalPrice > max) {
				max = totalPrice;
				price = P[i];
			}
		}
		System.out.printf("%d %d", price, max);
	}
}