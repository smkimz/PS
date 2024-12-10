import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int J = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), S, ans = 0;
		char[] Q;
		int[] sizes = new int[128];
		for (int i = 'A'; i <= 'Z'; i++)
			sizes[i] = 4;
		for (int i = 'a'; i <= 'z'; i++)
			sizes[i] = 2;
		for (int i = '0'; i <= '9'; i++)
			sizes[i] = 2;
		sizes[' '] = 1;
		while (--N >= 0) {
			Q = br.readLine().toCharArray();
			S = 0;
			for (int i = 0; i < Q.length; i++)
				S += sizes[Q[i]];
			ans += S <= J ? 1 : 0;
		}
		System.out.print(ans);
	}
}