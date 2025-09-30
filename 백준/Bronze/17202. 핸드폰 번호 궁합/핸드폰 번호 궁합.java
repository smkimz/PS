import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] A = br.readLine().toCharArray(), B = br.readLine().toCharArray(), X = new char[16];
		for (int i = 0; i < 16; i++) {
			if (i % 2 == 0)
				X[i] = A[i / 2];
			else
				X[i] = B[i / 2];
		}
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j <= 14 - i; j++)
				X[j] = (char) ((((X[j] - '0') + (X[j + 1] - '0')) % 10) + '0');
		}
		System.out.printf("%c%c", X[0], X[1]);
	}
}