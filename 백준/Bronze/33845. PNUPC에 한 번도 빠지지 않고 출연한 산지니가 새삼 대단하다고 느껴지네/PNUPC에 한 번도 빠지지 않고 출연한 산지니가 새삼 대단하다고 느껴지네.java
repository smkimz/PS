import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] S = br.readLine().toCharArray(), T = br.readLine().toCharArray();
		boolean[] c = new boolean[128];
		for (int i = 0; i < S.length; i++)
			c[S[i]] = true;
		for (int i = 0; i < T.length; i++) {
			if (!c[T[i]])
				sb.append(T[i]);
		}
		System.out.print(sb);
	}
}