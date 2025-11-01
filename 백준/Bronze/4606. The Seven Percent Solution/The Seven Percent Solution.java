import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] X = new String[128];
		for (int i = 0; i < 128; i++)
			X[i] = String.valueOf((char) i);
		X[' '] = "%20";
		X['!'] = "%21";
		X['$'] = "%24";
		X['%'] = "%25";
		X['('] = "%28";
		X[')'] = "%29";
		X['*'] = "%2a";
		char[] input;
		while (true) {
			input = br.readLine().toCharArray();
			if (input.length == 1 && input[0] == '#')
				break;
			for (int i = 0; i < input.length; i++)
				sb.append(X[input[i]]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
