import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, ans = 2;
		char x = br.readLine().charAt(0), y;
		while (--N >= 0) {
			y = br.readLine().charAt(0);
			if (x == y)
				continue;
			++ans;
			x = y;
		}
		System.out.println(ans);
	}
}
