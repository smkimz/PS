import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] IO = { 'I', 'O' };
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			if (str[i] != IO[i % 2])
				++ans;
		}
		System.out.println(ans);
	}
}