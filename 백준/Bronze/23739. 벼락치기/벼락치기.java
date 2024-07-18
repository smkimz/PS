import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), chapter, rest = 30, ans = 0;
		while (--N >= 0) {
			chapter = Integer.parseInt(br.readLine());
			if (rest < Math.ceil(chapter / 2.0)) {
				rest = 30;
				continue;
			}
			++ans;
			if (rest - chapter <= 0) {
				rest = 30;
				continue;
			}
			rest -= chapter;
		}
		System.out.println(ans);
	}
}