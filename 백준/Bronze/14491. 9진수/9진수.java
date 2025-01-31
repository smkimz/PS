import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), i = 0, ans = 0;
		while (T > 0) {
			ans += (T % 9) * Math.pow(10, i++);
			T /= 9;
		}
		System.out.println(ans);
	}
}