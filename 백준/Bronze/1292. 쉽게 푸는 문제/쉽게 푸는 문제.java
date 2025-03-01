import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), idx = 0, ans = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= i; j++) {
				++idx;
				if (idx < A)
					continue;
				if (idx > B) {
					System.out.println(ans);
					return;
				}
				ans += i;
			}
		}
	}
}