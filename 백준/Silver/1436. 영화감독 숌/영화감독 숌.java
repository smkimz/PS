import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), num = 665;
		while (N > 0) {
			++num;
			if (Integer.toString(num).contains("666"))
				--N;
		}
		System.out.println(num);
	}
}