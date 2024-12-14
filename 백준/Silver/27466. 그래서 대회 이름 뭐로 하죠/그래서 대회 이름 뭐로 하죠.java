import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), X = 0;
		char[] A = new char[128], S = br.readLine().toCharArray();
		for (int i = 'A'; i <= 'Z'; i++) {
			if (i == 'E' || i == 'I' || i == 'O' || i == 'U')
				A[i] = '1';
			else if (i == 'A')
				A[i] = '2';
			else
				A[i] = '0';
		}
		for (int i = N - 1; i >= 0; i--) {
			if ((X == 0 && A[S[i]] == '0') || ((X == 1 || X == 2) && A[S[i]] == '2') || (X >= 3)) {
				sb.append(S[i]);
				++X;
			}
			if (X == M) {
				System.out.println("YES");
				System.out.println(sb.reverse());
				return;
			}
		}
		System.out.println("NO");
	}
}