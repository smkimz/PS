import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] strA = br.readLine().toCharArray(), strB = br.readLine().toCharArray();
		int lenA = strA.length, lenB = strB.length;
		int[][] dp = new int[lenA + 1][lenB + 1];
		for (int i = 1; i <= lenA; i++) {
			for (int j = 1; j <= lenB; j++) {
				if (strA[i - 1] == strB[j - 1])
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		int[][] dt = { { -1, 0 }, { 0, -1 } };
		int row = lenA, col = lenB, drow, dcol;
		p: while (true) {
			if (dp[row][col] == 0)
				break;
			for (int i = 0; i <= 1; i++) {
				drow = row + dt[0][i];
				dcol = col + dt[1][i];
				if (dp[row][col] == dp[drow][dcol]) {
					row = drow;
					col = dcol;
					continue p;
				}
			}
			sb.append(strA[row - 1]);
			--row;
			--col;
		}
		System.out.println(sb.reverse());
	}
}