import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static String[][] S = { { "..#.", ".#.#", "#", ".#" }, { "..*.", ".*.*", "*", ".*" } };
	static int[] idx = { 0, 0, 1 };
	static char[] input;
	static int l;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine().toCharArray();
		l = input.length;
		for (int i = 0; i < 5; i++)
			constructStrings(i);
		System.out.print(sb);
	}

	static void constructStrings(int row) {
		if (row == 0 || row == 4) {
			for (int i = 0; i < l; i++)
				sb.append(S[idx[i % 3]][0]);
			sb.append(".").append("\n");
		} else if (row == 1 || row == 3) {
			for (int i = 0; i < l; i++)
				sb.append(S[idx[i % 3]][1]);
			sb.append(".").append("\n");
		} else {
			sb.append(S[0][2]);
			for (int i = 0; i < l; i++) {
				if (i % 3 == 2)
					sb.deleteCharAt(sb.length() - 1).append("*");
				sb.append(".").append(input[i]).append(S[idx[i % 3]][3]);
			}
			sb.append("\n");
		}
	}
}