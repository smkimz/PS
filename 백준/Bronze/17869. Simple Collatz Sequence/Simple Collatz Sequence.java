import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		int ret = 0;
		while (N > 1) {
			if (N % 2 == 1)
				N += 1;
			else
				N /= 2;
			++ret;
		}
		System.out.println(ret);
	}
}
