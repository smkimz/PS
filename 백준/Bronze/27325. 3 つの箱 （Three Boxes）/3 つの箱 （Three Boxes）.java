import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 1, ans = 0;
		char[] S = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			x += S[i] == 'L' ? -1 : 1;
			x += x == 0 ? 1 : 0;
			x -= x == 4 ? 1 : 0;
			ans += x == 3 ? 1 : 0;
		}
		System.out.println(ans);
	}
}