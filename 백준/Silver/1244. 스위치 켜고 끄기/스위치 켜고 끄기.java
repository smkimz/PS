import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M, number;
		int[] switches = new int[N + 1];
		char gender;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			switches[i] = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			gender = st.nextToken().charAt(0);
			number = Integer.parseInt(st.nextToken());
			if (gender == '1') {
				for (int i = 1; number * i <= N; i++)
					switches[number * i] = switches[number * i] == 0 ? 1 : 0;
			} else {
				switches[number] = switches[number] == 0 ? 1 : 0;
				for (int i = 1; number + i <= N && number - i >= 1
						&& switches[number + i] == switches[number - i]; i++) {
					switches[number + i] = switches[number + i] == 0 ? 1 : 0;
					switches[number - i] = switches[number - i] == 0 ? 1 : 0;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			sb.append(switches[i]);
			if (i % 20 == 0)
				sb.append("\n");
			else
				sb.append(" ");
		}
		System.out.print(sb);
	}
}