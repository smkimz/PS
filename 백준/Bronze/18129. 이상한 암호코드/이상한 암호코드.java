import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] S = st.nextToken().concat(" ").toUpperCase().toCharArray();
		int K = Integer.parseInt(st.nextToken()), len = 1;
		boolean[] C = new boolean['Z' + 1];
		for (int i = 1; i < S.length; i++) {
			if (S[i] == S[i - 1]) {
				++len;
				continue;
			}
			if (!C[S[i - 1]]) {
				C[S[i - 1]] = true;
				if (len >= K)
					sb.append(1);
				else
					sb.append(0);
			}
			len = 1;
		}
		System.out.print(sb);
	}
}