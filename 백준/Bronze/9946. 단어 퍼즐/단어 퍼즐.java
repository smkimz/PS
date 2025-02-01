import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caseNumber = 0;
		int[] count;
		String X, Y;
		boolean isDifferent;
		while (true) {
			X = br.readLine();
			Y = br.readLine();
			if (X.equals("END") && Y.equals("END"))
				break;
			++caseNumber;
			sb.append("Case ").append(caseNumber);
			if (X.length() != Y.length()) {
				sb.append(": different\n");
				continue;
			}
			count = new int['z' + 1];
			for (int i = 0; i < X.length(); i++) {
				++count[X.charAt(i)];
				--count[Y.charAt(i)];
			}
			isDifferent = false;
			for (int i = 'a'; i <= 'z'; i++) {
				if (count[i] == 0)
					continue;
				isDifferent = true;
				break;
			}
			if (isDifferent)
				sb.append(": different\n");
			else
				sb.append(": same\n");
		}
		System.out.print(sb);
	}
}