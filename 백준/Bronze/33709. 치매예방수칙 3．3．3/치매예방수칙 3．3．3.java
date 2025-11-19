import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0;
		char[] slogan = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			if (slogan[i] >= '0' && slogan[i] <= '9')
				y = y * 10 + (slogan[i] - '0');
			else {
				x += y;
				y = 0;
			}
		}
		x += y;
		System.out.println(x);
	}
}
