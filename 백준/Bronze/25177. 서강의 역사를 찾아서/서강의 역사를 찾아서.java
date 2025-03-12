import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), X = Math.max(N, M), ans = 0;
		int[] A = new int[X], B = new int[X];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++)
			B[i] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < X; i++)
			ans = Math.max(ans, B[i] - A[i]);
		System.out.println(ans);
	}
}