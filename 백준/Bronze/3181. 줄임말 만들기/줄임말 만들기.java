import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[][] exWords = new String[][] { { "" }, { "i", "a" }, { "pa", "te", "ni", "no" }, { "ali", "ili" },
				{ "niti", "nego" } };
		String word;
		int len;
		boolean isExcluded;
		sb.append((char) (st.nextToken().charAt(0) - 32));
		while (st.hasMoreTokens()) {
			word = st.nextToken();
			len = word.length();
			if (len < exWords.length) {
				isExcluded = false;
				for (int i = 0; i < exWords[len].length; i++) {
					if (word.equals(exWords[len][i])) {
						isExcluded = true;
						break;
					}
				}
				if (isExcluded)
					continue;
			}
			sb.append((char) (word.charAt(0) - 32));
		}
		System.out.print(sb);
	}
}