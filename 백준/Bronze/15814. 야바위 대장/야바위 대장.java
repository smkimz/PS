import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int T = Integer.parseInt(br.readLine()), A, B;
		StringTokenizer st;
		char x;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			x = S[A];
			S[A] = S[B];
			S[B] = x;
		}
		System.out.println(String.valueOf(S));
	}
}