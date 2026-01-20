import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, x = N / 8 + 1;
		char y = (char) ((N % 8) + 97);
		System.out.printf("%c%d", y, x);
	}
}