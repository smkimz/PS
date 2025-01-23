import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = Integer.parseInt(br.readLine()),
				b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
		if (b - a == c - b)
			System.out.println(a + N * (b - a));
		else
			System.out.println((int) Math.pow((b / a), N) * a);
	}
}