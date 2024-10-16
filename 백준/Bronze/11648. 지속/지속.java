import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 1, ans = 0;
		while (N >= 10) {
			++ans;
			val = 1;
			while (N != 0) {
				val *= N % 10;
				N /= 10;
			}
			N = val;
		}
		System.out.println(ans);
	}
}