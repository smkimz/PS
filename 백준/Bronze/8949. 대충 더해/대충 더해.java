import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] A = st.nextToken().toCharArray(), B = st.nextToken().toCharArray();
		int alen = A.length, blen = B.length, diff = alen - blen;
		if (diff > 0) {
			for (int i = 0; i < diff; i++)
				sb.append(A[i]);
			for (int i = 0; i < blen; i++)
				sb.append(A[i + diff] + B[i] - 2 * '0');
		} else {
			for (int i = 0; i < -diff; i++)
				sb.append(B[i]);
			for (int i = 0; i < alen; i++)
				sb.append(A[i] + B[i - diff] - 2 * '0');
		}
		System.out.println(sb);
	}
}
