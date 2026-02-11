import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String C;
		String[] rn = new String[] { "a king.\n", "a queen.\n", "nobody.\n" };
		int[] r = new int['z' + 1];
		char[] v = new char[] { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < v.length; i++)
			r[v[i]] = 1;
		r['y'] = 2;
		for (int x = 1; x <= T; x++) {
			C = br.readLine();
			sb.append("Case #").append(x).append(": ").append(C).append(" is ruled by ")
					.append(rn[r[C.charAt(C.length() - 1)]]);
		}
		System.out.print(sb);
	}
}