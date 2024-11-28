import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		char[] S = br.readLine().toCharArray();
		int q = Integer.parseInt(br.readLine()), a, l, r, z;
		int[][] C = new int[26][S.length];
		++C[S[0] - 'a'][0];
		for (int i = 1; i < S.length; i++) {
			for (int j = 0; j < 26; j++)
				C[j][i] = C[j][i - 1];
			++C[S[i] - 'a'][i];
		}
		while (--q >= 0) {
			st = new StringTokenizer(br.readLine());
			a = st.nextToken().charAt(0) - 'a';
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			if (l == 0)
				z = C[a][r];
			else
				z = C[a][r] - C[a][l - 1];
			sb.append(z).append("\n");
		}
		System.out.print(sb);
	}
}