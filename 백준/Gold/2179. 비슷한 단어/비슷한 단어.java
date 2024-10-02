import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> substrs = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), S = -1, T = -1, len, maxLen = -1, X;
		String substr;
		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
			substr = "";
			len = 0;
			X = Integer.MAX_VALUE;
			for (int j = 0; j < words[i].length(); j++) {
				substr += words[i].charAt(j);
				if (substrs.containsKey(substr)) {
					X = substrs.get(substr);
					len = j;
					continue;
				}
				substrs.put(substr, i);
			}
			if (len > maxLen || (len == maxLen && X < S)) {
				maxLen = len;
				S = X;
				T = i;
			}
		}
		System.out.println(sb.append(words[S]).append("\n").append(words[T]));
	}
}