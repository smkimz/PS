import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), x = ((a + 1) * a / 2) % 14579,
				ans = x;
		for (int i = a + 1; i <= b; i++) {
			x += i;
			ans *= x;
			ans %= 14579;
		}
		System.out.println(ans);
	}
}