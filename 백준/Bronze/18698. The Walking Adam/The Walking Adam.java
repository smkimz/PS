import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), c;
		char[] W;
		while (--T >= 0) {
			W = br.readLine().toCharArray();
			c = 0;
			for (int i = 0; i < W.length; i++) {
				if (W[i] == 'D')
					break;
				++c;
			}
			sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
}