import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x, sum = 0, ans = 0;
		for (int i = 1; i <= N / 2; i++) {
			x = i;
			sum = 0;
			while (sum < N)
				sum += x++;
			if (sum == N)
				++ans;
		}
		System.out.println(ans + 1);
	}
}