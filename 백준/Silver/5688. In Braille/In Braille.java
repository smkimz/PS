import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static HashMap<Integer, Character> binaryMap = new HashMap<Integer, Character>();
	static char[][][] brailles = new char[10][2][2];
	static int[][] brailleToBinary = { { 1, 2 }, { 4, 8 } };
	static int D = 0;

	public static void main(String args[]) throws IOException {
		init();
		char order;
		D = Integer.parseInt(br.readLine());
		while (D != 0) {
			order = br.readLine().charAt(0);
			if (order == 'S')
				handleDecimal();
			else
				handleBraille();
			D = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}

	static void handleDecimal() throws IOException {
		char[] num = br.readLine().toCharArray();
		for (int r = 0; r <= 1; r++) {
			for (int n = 0; n < D; n++) {
				for (int c = 0; c <= 1; c++)
					sb.append(brailles[num[n] - '0'][r][c]);
				sb.append(" ");
			}
			sb.append("\n");
		}
		for (int n = 0; n < D; n++)
			sb.append(".. ");
		sb.append("\n");
	}

	static void handleBraille() throws IOException {
		int binary = 0;
		char[] num = new char[D];
		char[][] B = new char[2][];
		for (int r = 0; r <= 1; r++)
			B[r] = br.readLine().toCharArray();
		for (int n = 0; n < D; n++) {
			binary = 0;
			for (int r = 0; r <= 1; r++) {
				for (int c = 0; c <= 1; c++) {
					if (B[r][3 * n + c] == '*')
						binary += brailleToBinary[r][c];
				}
			}
			num[n] = binaryMap.get(binary);
		}
		sb.append(num).append("\n");
		br.readLine();
	}

	static void init() {
		int[] b = { 14, 1, 5, 3, 11, 9, 7, 15, 13, 6 };
		for (int i = 0; i <= 9; i++)
			binaryMap.put(b[i], (char) (i + '0'));
		for (int n = 0; n <= 9; n++) {
			if (n != 0 && n != 9)
				brailles[n][0][0] = '*';
			else
				brailles[n][0][0] = '.';
			if (n != 1 && n != 2 && n != 5 && n != 8)
				brailles[n][0][1] = '*';
			else
				brailles[n][0][1] = '.';
			if (n != 1 && n != 3 && n != 4 && n != 5)
				brailles[n][1][0] = '*';
			else
				brailles[n][1][0] = '.';
			if (n != 1 && n != 2 && n != 3 && n != 6 && n != 9)
				brailles[n][1][1] = '*';
			else
				brailles[n][1][1] = '.';
		}
	}
}