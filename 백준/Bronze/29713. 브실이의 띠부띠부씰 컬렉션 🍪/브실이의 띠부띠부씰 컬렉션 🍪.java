import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		int[] C = new int[128];
		char[] S = br.readLine().toCharArray(),
				B = new char[] { 'B', 'R', 'O', 'N', 'Z', 'E', 'S', 'I', 'L', 'V', 'E', 'R' };
		for (int i = 0; i < N; i++)
			++C[S[i]];
		while (true) {
			for (int i = 0; i <= 11; i++) {
				if (C[B[i]] <= 0) {
					System.out.println(ans);
					return;
				}
				--C[B[i]];
			}
			++ans;
		}
	}
}