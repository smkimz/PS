import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X, Y, Z = Integer.parseInt(br.readLine()), ans = 0;
		while (--N >= 0) {
			X = Integer.parseInt(br.readLine());
			Y = X > Z ? X - 360 : X + 360;
			ans += Math.min(Math.abs(Z - X), Math.abs(Z - Y));
			Z = X;
		}
		System.out.println(ans);
	}
}