import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), idx;
		char[] S = br.readLine().toCharArray(), P;
		while (--M >= 0) {
			P = br.readLine().toCharArray();
			idx = 0;
			for (int i = 0; i < P.length && idx < N; i++) {
				if (P[i] == S[idx])
					++idx;
			}
			if (idx == N)
				sb.append("true\n");
			else
				sb.append("false\n");
		}
		System.out.print(sb);
	}
}