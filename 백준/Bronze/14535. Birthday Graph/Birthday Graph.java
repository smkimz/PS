import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N, caseNumber = 1;
		int[] month;
		String[] monthName = new String[] { "", "Jan:", "Feb:", "Mar:", "Apr:", "May:", "Jun:", "Jul:", "Aug:", "Sep:",
				"Oct:", "Nov:", "Dec:" };
		while (true) {
			N = Integer.parseInt(br.readLine().trim());
			if (N == 0)
				break;
			month = new int[13];
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				++month[Integer.parseInt(st.nextToken())];
			}
			sb.append("Case #").append(caseNumber++).append(":\n");
			for (int i = 1; i <= 12; i++) {
				sb.append(monthName[i]);
				for (int j = 0; j < month[i]; j++)
					sb.append("*");
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}