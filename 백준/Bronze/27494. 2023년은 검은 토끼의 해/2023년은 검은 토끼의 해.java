import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, y, ans = 0;
		int[] table = { 3, 2, 0, 2 };
		for (int i = 2023; i <= N; i++) {
			x = i;
			y = 0;
			while (x > 0) {
				if (x % 10 == table[y]) {
					if (y == 3) {
						ans++;
						break;
					}
					y++;
				}
				x /= 10;
			}
		}
		System.out.println(ans);
	}
}
