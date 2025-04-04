import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] signs = new boolean[128];
		signs['I'] = true;
		signs['O'] = true;
		signs['S'] = true;
		signs['H'] = true;
		signs['Z'] = true;
		signs['X'] = true;
		signs['N'] = true;
		char[] S = br.readLine().toCharArray();
		for (int i = 0; i < S.length; i++) {
			if (!signs[S[i]]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}