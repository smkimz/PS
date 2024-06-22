import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] type = { "+---+", "+   +", "    +", "|   |", "|    ", "    |", "  o  ", "     ", "  ", "\n", "end" };
		int[][] builder = { { 0, 3, 3, 1, 3, 3, 0 }, { 2, 5, 5, 2, 5, 5, 2 }, { 0, 5, 5, 0, 4, 4, 0 },
				{ 0, 5, 5, 0, 5, 5, 0 }, { 1, 3, 3, 0, 5, 5, 2 }, { 0, 4, 4, 0, 5, 5, 0 }, { 0, 4, 4, 0, 3, 3, 0 },
				{ 0, 5, 5, 2, 5, 5, 2 }, { 0, 3, 3, 0, 3, 3, 0 }, { 0, 3, 3, 0, 5, 5, 0 } };
		char[] time = br.readLine().toCharArray();
		while (time[0] != 'e') {
			for (int i = 0; i <= 6; i++) {
				for (int j = 0; j <= 4; j++) {
					if (j == 2) {
						if (i == 2 || i == 4)
							sb.append(type[6]);
						else
							sb.append(type[7]);
						continue;
					}
					sb.append(type[builder[time[j] - '0'][i]]);
					if (j == 0 || j == 3)
						sb.append(type[8]);
					else if (j == 4)
						sb.append(type[9]);
				}
			}
			sb.append(type[9]).append(type[9]);
			time = br.readLine().toCharArray();
			if (time[0] == 'e') {
				sb.append(type[10]);
				break;
			}
		}
		System.out.print(sb);
	}
}
