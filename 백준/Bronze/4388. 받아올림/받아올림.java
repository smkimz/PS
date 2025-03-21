import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		char[] A, B;
		int l, x, y, z, p, ret;
		while (true) {
			st = new StringTokenizer(br.readLine());
			A = st.nextToken().toCharArray();
			B = st.nextToken().toCharArray();
			if (A[0] == '0' && B[0] == '0' && A.length == 1 && B.length == 1)
				break;
			l = Math.max(A.length, B.length);
			p = 0;
			ret = 0;
			for (int i = 1; i <= l; i++) {
				if (A.length - i >= 0)
					x = A[A.length - i] - '0';
				else
					x = 0;
				if (B.length - i >= 0)
					y = B[B.length - i] - '0';
				else
					y = 0;
				z = (x + y + p) / 10;
				if (z >= 1) {
					++ret;
					p = z;
				} else
					p = 0;
			}
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}