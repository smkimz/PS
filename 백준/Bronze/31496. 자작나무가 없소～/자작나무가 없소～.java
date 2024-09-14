import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), ans = 0, idxA, idxB, quantity;
		char[] S = st.nextToken().toCharArray(), substr;
		String itemName;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			itemName = st.nextToken();
			quantity = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(itemName, "_");
			p: while (st.hasMoreTokens()) {
				substr = st.nextToken().toCharArray();
				if (substr.length != S.length)
					continue;
				idxA = 0;
				idxB = 0;
				while (true) {
					if (substr[idxA++] != S[idxB])
						break;
					if (++idxB < S.length)
						continue;
					ans += quantity;
					break p;
				}
			}
		}
		System.out.println(ans);
	}
}