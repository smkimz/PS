import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] loc = new int[3][2];
		StringTokenizer st;
		for (int i = 0; i <= 2; i++) {
			st = new StringTokenizer(br.readLine());
			loc[i][0] = Integer.parseInt(st.nextToken());
			loc[i][1] = Integer.parseInt(st.nextToken());
		}

		if (loc[0][0] == 1 || loc[0][1] == 1) {
			if (loc[1][0] == loc[2][0] && loc[1][1] == loc[2][1])
				System.out.println("YES");
			else
				System.out.println("NO");
			return;
		}

		if (loc[1][0] % 2 == loc[2][0] % 2) {
			if (loc[1][1] % 2 == loc[2][1] % 2)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			if (loc[1][1] % 2 != loc[2][1] % 2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}