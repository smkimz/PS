import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), res;
		int T = Integer.parseInt(br.readLine()), a, b, la, lb, sum, x, i;
		char[] A, B;
		StringTokenizer st;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			A = st.nextToken().toCharArray();
			B = st.nextToken().toCharArray();
			la = A.length;
			lb = B.length;
			x = 0;
			res = new StringBuilder();
			while (la > 0 || lb > 0) {
				--la;
				--lb;
				a = (la >= 0) ? (A[la] - '0') : 0;
				b = (lb >= 0) ? (B[lb] - '0') : 0;
				sum = a + b + x;
				res.append(sum % 2);
				x = (sum >= 2) ? 1 : 0;
			}
			if (x == 1)
				res.append('1');
			res.reverse();
			i = 0;
			while (i < res.length() - 1 && res.charAt(i) == '0')
				i++;
			if (i > 0)
				res.delete(0, i);
			sb.append(res).append("\n");
		}
		System.out.print(sb);
	}
}
