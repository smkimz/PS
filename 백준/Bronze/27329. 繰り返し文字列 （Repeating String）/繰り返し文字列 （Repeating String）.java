import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), h = N / 2, x = h;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < h; i++) {
			if (str[i] == str[x + i])
				continue;
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}