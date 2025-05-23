import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()), X = 2, ans = 0;
		double R = Integer.parseInt(br.readLine()) / 100.0;
		L *= R;
		while (L > 5) {
			ans += L * X;
			L *= R;
			X *= 2;
		}
		System.out.println(ans);
	}
}