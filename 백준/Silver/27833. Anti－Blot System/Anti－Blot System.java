import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), machula, idx;
		String[] str;
		while (--N >= 0) {
			br.readLine();
			str = br.readLine().split(" ");
			machula = 0;
			idx = 0;
			for (int i = 0; i < 5; i++) {
				if (i % 2 == 1)
					continue;
				if (str[i].contains("machula")) {
					idx = i;
					continue;
				}
				if (i == 4) {
					machula = Integer.parseInt(str[i]) - machula;
					break;
				}
				machula += Integer.parseInt(str[i]);
			}
			str[idx] = String.valueOf(machula);
			sb.append(str[0]).append(" + ").append(str[2]).append(" = ").append(str[4]).append("\n");
		}
		System.out.print(sb);
	}
}