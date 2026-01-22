import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine()), sum = N;
		for (int i = 0; i < k; i++) {
			N *= 10;
			sum += N;
		}
		System.out.println(sum);
	}
}