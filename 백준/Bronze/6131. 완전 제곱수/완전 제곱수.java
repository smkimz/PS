import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), diff, ans = 0;
		if (N == 0) {
			System.out.println(N);
			return;
		}
		for (int i = 1; i <= 500; i++) {
			if (Math.pow(i + 1, 2) - Math.pow(i, 2) > N)
				break;
			for (int j = i + 1; j <= 500; j++) {
				diff = j * j - i * i;
				if (diff < N)
					continue;
				if (diff == N)
					++ans;
				break;
			}
		}
		System.out.println(ans);
	}
}