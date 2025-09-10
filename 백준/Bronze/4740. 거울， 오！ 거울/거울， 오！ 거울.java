import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), str = new StringBuilder();
		String input;
		while (true) {
			input = br.readLine();
			if (input.equals("***"))
				break;
			str = new StringBuilder(input).reverse();
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
}