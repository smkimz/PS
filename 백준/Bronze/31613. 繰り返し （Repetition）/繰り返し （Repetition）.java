import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), ans = 0;
		while (X < N) {
			if (X % 3 == 1)
				X *= 2;
			else if (X % 3 == 2)
				X *= 3;
			else
				X += 1;
			++ans;
		}
		System.out.println(ans);
	}
}