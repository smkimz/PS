import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), len = 0;
		char[] str = br.readLine().toCharArray();
		for (int i = 1; i < N; i++) {
			if (Math.abs(str[i - 1] - str[i]) != 1) {
				len = 0;
				continue;
			}
			++len;
			if (len < 4)
				continue;
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}