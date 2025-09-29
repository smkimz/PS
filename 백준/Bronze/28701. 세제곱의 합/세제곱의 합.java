import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s = 0, t = 0;
		for (int i = 1; i <= N; i++) {
			s += i;
			t += Math.pow(i, 3);
		}
		System.out.printf("%d\n%d\n%d", s, (int) Math.pow(s, 2), t);
	}
}