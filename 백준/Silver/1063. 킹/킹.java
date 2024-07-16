import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] loc = new int[2][2], dt = { { 0, 0, 1, -1, -1, -1, 1, 1 }, { 1, -1, 0, 0, 1, -1, 1, -1 } };
		HashMap<String, Integer> orders = new HashMap<String, Integer>();
		String[] moves = { "R", "L", "B", "T", "RT", "LT", "RB", "LB" };
		for (int i = 0; i <= 7; i++)
			orders.put(moves[i], i);
		StringTokenizer st = new StringTokenizer(br.readLine());
		String start;
		for (int i = 0; i <= 1; i++) {
			start = st.nextToken();
			loc[i][0] = '8' - start.charAt(1);
			loc[i][1] = start.charAt(0) - 'A';
		}
		int N = Integer.parseInt(st.nextToken()), order, dr, dc, sdr, sdc;
		while (--N >= 0) {
			order = orders.get(br.readLine());
			dr = loc[0][0] + dt[0][order];
			dc = loc[0][1] + dt[1][order];
			if (dr < 0 || dr > 7 || dc < 0 || dc > 7)
				continue;
			if (dr == loc[1][0] && dc == loc[1][1]) {
				sdr = loc[1][0] + dt[0][order];
				sdc = loc[1][1] + dt[1][order];
				if (sdr < 0 || sdr > 7 || sdc < 0 || sdc > 7)
					continue;
				loc[1][0] = sdr;
				loc[1][1] = sdc;
			}
			loc[0][0] = dr;
			loc[0][1] = dc;
		}
		for (int i = 0; i <= 1; i++)
			sb.append((char) (loc[i][1] + 'A')).append((char) ('8' - loc[i][0])).append("\n");
		System.out.print(sb);
	}
}