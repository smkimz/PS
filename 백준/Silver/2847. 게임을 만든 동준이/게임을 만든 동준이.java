import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, dec;
		int[] scores = new int[N];
		for (int i = 0; i < N; i++)
			scores[i] = Integer.parseInt(br.readLine());
		for (int i = N - 2; i >= 0; i--) {
			if (scores[i] < scores[i + 1])
				continue;
			dec = scores[i] - scores[i + 1] + 1;
			scores[i] -= dec;
			ans += dec;
		}
		System.out.println(ans);
	}
}