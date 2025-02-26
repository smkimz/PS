import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
				z = Integer.parseInt(st.nextToken());
		if (x + y == z)
			System.out.printf("%d+%d=%d", x, y, z);
		else if (x - y == z)
			System.out.printf("%d-%d=%d", x, y, z);
		else if (x * y == z)
			System.out.printf("%d*%d=%d", x, y, z);
		else if (x % y == 0 && x / y == z)
			System.out.printf("%d/%d=%d", x, y, z);
		else if (x == y + z)
			System.out.printf("%d=%d+%d", x, y, z);
		else if (x == y - z)
			System.out.printf("%d=%d-%d", x, y, z);
		else if (x == y * z)
			System.out.printf("%d=%d*%d", x, y, z);
		else if (y % z == 0 && x == y / z)
			System.out.printf("%d=%d/%d", x, y, z);
	}
}