import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), sum = x + y, z;
		if (x < y || sum % 2 == 1) {
			System.out.println(-1);
			return;
		}
		sum /= 2;
		z = 2 * sum - x;
		if (z != y)
			System.out.println(-1);
		else
			System.out.printf("%d %d", sum, x - sum);
	}
}