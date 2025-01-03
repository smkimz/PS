import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), sum = 0, x = 0;
		int[] A = new int[N], B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
			sum += A[i];
		}
		sum /= 2;
		for (int i = 1; i < N; i += 2)
			x += A[i];
		B[0] = sum - x;
		sb.append(B[0]).append("\n");
		for (int i = 1; i < N; i++) {
			B[i] = A[i - 1] - B[i - 1];
			sb.append(B[i]).append("\n");
		}
		System.out.print(sb);
	}
}