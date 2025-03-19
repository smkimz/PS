import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] A = st.nextToken().toCharArray(), B = st.nextToken().toCharArray();
		long ans = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++)
				ans += (A[i] - '0') * (B[j] - '0');
		}
		System.out.println(ans);
	}
}