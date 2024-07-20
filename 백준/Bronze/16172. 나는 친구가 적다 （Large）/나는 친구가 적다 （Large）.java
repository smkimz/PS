import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] S, K;
	static int[] table;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine().replaceAll("[0-9]", "").toCharArray();
		K = br.readLine().toCharArray();
		makeTable();
		System.out.println(kmp());
	}

	static int kmp() {
		int idx = 0;
		for (int i = 0; i < S.length; i++) {
			while (idx >= 1 && S[i] != K[idx])
				idx = table[idx - 1];
			if (S[i] == K[idx]) {
				if (idx == K.length - 1)
					return 1;
				++idx;
			}
		}
		return 0;
	}

	static void makeTable() {
		int idx = 0;
		table = new int[K.length];
		for (int i = 1; i < K.length; i++) {
			while (idx >= 1 && K[i] != K[idx])
				idx = table[idx - 1];
			if (K[i] == K[idx])
				table[i] = ++idx;
		}
	}
}