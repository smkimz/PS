import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < N / 2; i++) {
			if (str[i] == str[N - 1 - i])
				continue;
			ans++;
		}
		System.out.println(ans);
	}
}