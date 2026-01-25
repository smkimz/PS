import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] C = br.readLine().toCharArray();
		int[] S = new int['B' + 1];
		for (int i = 0; i < C.length; i++)
			++S[C[i]];
		System.out.printf("%d : %d", S['A'], S['B']);
	}
}