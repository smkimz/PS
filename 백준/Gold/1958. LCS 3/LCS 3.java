import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int[][] DELTA = new int[][] { { -1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] strs = new char[4][];
		for (int i = 0; i < 3; i++)
			strs[i] = br.readLine().toCharArray();
		System.out.println(find3DLCS(strs[0], strs[1], strs[2]));
	}

	static int find3DLCS(char[] strA, char[] strB, char[] strC) {
		int[][][] dp = new int[strA.length + 1][strB.length + 1][strC.length + 1];
		for (int i = 1; i <= strA.length; i++) {
			for (int j = 1; j <= strB.length; j++) {
				for (int k = 1; k <= strC.length; k++) {
					if (strA[i - 1] == strB[j - 1] && strA[i - 1] == strC[k - 1])
						dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
					else
						dp[i][j][k] = Math.max(Math.max(dp[i - 1][j][k], dp[i][j - 1][k]), dp[i][j][k - 1]);
				}
			}
		}
		return dp[strA.length][strB.length][strC.length];
	}
}