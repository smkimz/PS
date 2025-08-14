import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] cup = new int[] { 0, 1, 2, 3 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] move = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 1, 3 }, { 2, 3 } };
		char[] cmd = br.readLine().toCharArray();
		int order;
		for (int i = 0; i < cmd.length; i++) {
			order = cmd[i] - 'A';
			change(move[order][0], move[order][1]);
		}
		for (int i = 0; i < 4; i++) {
			if (cup[i] != 0)
				continue;
			sb.append(i + 1).append("\n");
			break;
		}
		for (int i = 0; i < 4; i++) {
			if (cup[i] != 3)
				continue;
			sb.append(i + 1);
			break;
		}
		System.out.print(sb);
	}

	static void change(int x, int y) {
		int temp = cup[x];
		cup[x] = cup[y];
		cup[y] = temp;
	}
}