import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] A = br.readLine().toCharArray(), B = br.readLine().toCharArray();
		int x = 0, y = B.length - 1, z, l, ans = A.length + B.length;
		boolean isAvailable;
		while (x < A.length) {
			if (y != 0)
				z = Math.min(A.length, B.length - y);
			else
				z = Math.min(A.length - x, B.length);
			l = A.length + B.length - z;
			if (l >= ans)
				break;
			isAvailable = true;
			for (int i = 0; i < z; i++) {
				if (A[x + i] == '1' || B[y + i] == '1')
					continue;
				isAvailable = false;
				break;
			}
			if (isAvailable)
				ans = l;
			if (y == 0)
				++x;
			else
				--y;
		}
		System.out.println(ans);
	}
}