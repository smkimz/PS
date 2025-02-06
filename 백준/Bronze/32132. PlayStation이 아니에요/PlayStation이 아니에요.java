import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), i = 0;
		char[] S = br.readLine().toCharArray();
		while (i < N - 2) {
			sb.append(S[i]);
			if (S[i] != 'P' || S[i + 1] != 'S') {
				++i;
				continue;
			}
			sb.append(S[i + 1]);
			i += 2;
			while (i < N && (S[i] == '4' || S[i] == '5'))
				++i;
		}
		while (i < N)
			sb.append(S[i++]);
		System.out.println(sb);
	}
}