import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		if (N == 0)
			ans = 1;
		else if (N < 0)
			ans = 32;
		else
			while (N != 0) {
				N /= 2;
				++ans;
			}
		System.out.println(ans);
	}
}
