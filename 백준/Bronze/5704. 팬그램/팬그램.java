import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str;
		boolean[] checker;
		boolean isNotPangram;
		while (true) {
			str = br.readLine().toCharArray();
			if (str[0] == '*')
				break;
			checker = new boolean[128];
			isNotPangram = false;
			for (int i = 0; i < str.length; i++)
				checker[str[i]] = true;
			for (int i = 'a'; i <= 'z'; i++) {
				if (!checker[i]) {
					isNotPangram = true;
					break;
				}
			}
			if (isNotPangram)
				sb.append("N\n");
			else
				sb.append("Y\n");
		}
		System.out.print(sb);
	}
}