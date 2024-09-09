import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(st.nextToken()), val = a, ans = a;
		int[][] pow = { {}, { 1, 1 }, { 1, 2, 4, 8, 16, 32, 64 }, { 1, 3, 9, 27, 81 } };
		int b = Integer.parseInt(st.nextToken()), x = 1, y = 1, z = b;
		for (int i = 2; i <= 3; i++) {
			for (int j = 0; j < pow[i].length; j++) {
				if (pow[i][j] < b || pow[x][y] < pow[i][j])
					continue;
				x = i;
				y = j;
			}
		}

		z -= pow[x][y];
		for (int i = 1; i < x; i++)
			val = val.multiply(a);
		for (int i = 1; i < y; i++)
			ans = ans.multiply(val);
		for (int i = 0; i < z; i++)
			ans = ans.multiply(a);
		System.out.println(ans.toPlainString());
	}
}