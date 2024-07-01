import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine()), K = 0, ans = 0;
		if (N == 0) {
			System.out.println(0);
			return;
		}
		++K;
		++ans;
		while (K < N) {
			ans++;
			if (K * 2 > N)
				break;
			K *= 2;
		}
		System.out.println(ans);
	}
}