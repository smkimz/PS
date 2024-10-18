import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] x = br.readLine().toCharArray(), y;
		int N = Integer.parseInt(br.readLine()), ans = 0;
		boolean isUnavailable;
		while (--N >= 0) {
			y = br.readLine().toCharArray();
			isUnavailable = false;
			for (int i = 0; i < 5; i++) {
				if (x[i] == y[i])
					continue;
				isUnavailable = true;
				break;
			}
			if (!isUnavailable)
				++ans;
		}
		System.out.println(ans);
	}
}