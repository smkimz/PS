import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] ganzi = { { 'I', 'J', 'K', 'L', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' },
				{ '6', '7', '8', '9', '0', '1', '2', '3', '4', '5' } };
		int year = Integer.parseInt(br.readLine());
		System.out.printf("%c%c", ganzi[0][year % 12], ganzi[1][year % 10]);
	}
}