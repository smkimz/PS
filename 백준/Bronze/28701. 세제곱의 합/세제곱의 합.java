import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s = N * (N + 1) / 2, t = (int) Math.pow(s, 2);
		System.out.printf("%d\n%d\n%d", s, t, t);
	}
}