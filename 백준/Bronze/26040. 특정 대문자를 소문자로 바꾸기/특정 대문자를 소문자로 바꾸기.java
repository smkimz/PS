import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] A = br.readLine().toCharArray(), alps = new char['z' + 1];
		for (int i = 'A'; i <= 'Z'; i++)
			alps[i] = (char) i;
		for (int i = 'a'; i <= 'z'; i++)
			alps[i] = (char) i;
		StringTokenizer st = new StringTokenizer(br.readLine());
		char c;
		while (st.hasMoreTokens()) {
			c = st.nextToken().charAt(0);
			alps[c] = (char) (c + 32);
		}
		for (int i = 0; i < A.length; i++)
			sb.append(alps[A[i]]);
		System.out.print(sb);
	}
}
