import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, sum = 0;
		while (true) {
			x = Integer.parseInt(br.readLine());
			if (x == -1)
				break;
			sum += x;
		}
		System.out.println(sum);
	}
}