import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray(), P = br.readLine().toCharArray();
		System.out.println(KMP(S, P) ? '1' : '0');
	}

	private static boolean KMP(char[] S, char[] P) {
		int[] table = makeTable(P);
		int x = 0;
		for (int i = 0; i < S.length; i++) {
			while (x > 0 && S[i] != P[x])
				x = table[x - 1];
			if (S[i] == P[x])
				++x;
			if (x == P.length)
				return true;
		}
		return false;
	}

	private static int[] makeTable(char[] P) {
		int[] table = new int[P.length];
		int l = 0;
		for (int i = 1; i < P.length; i++) {
			while (l > 0 && P[i] != P[l])
				l = table[l - 1];
			if (P[i] == P[l]) {
				++l;
				table[i] = l;
			}
		}
		return table;
	}
}