import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		char[] S;
		while (--T >= 0) {
			S = br.readLine().toCharArray();
			for (int i = 0; i < S.length - 1; i++) {
				sb.append(S[i]);
				if (S[i] == 'P' && S[i + 1] == 'O')
					sb.append('H');
			}
			sb.append(S[S.length - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
