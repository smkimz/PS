import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), K;
		char[] x;
		boolean isValid;
		while (--N >= 0) {
			K = Integer.parseInt(br.readLine()) + 1;
			while (true) {
				x = String.valueOf(K).toCharArray();
				isValid = true;
				for (int i = x.length - 1; i >= 0; i--) {
					if (x[i] == '0') {
						++K;
						isValid = false;
						break;
					}
				}
				if (isValid)
					break;
			}
			sb.append(K).append("\n");
		}
		System.out.print(sb);
	}
}