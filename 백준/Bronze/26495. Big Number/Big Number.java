import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[][] strs = new String[][] { { "0000", "0  0", "0  0", "0  0", "0000" },
				{ "   1", "   1", "   1", "   1", "   1" }, { "2222", "   2", "2222", "2", "2222" },
				{ "3333", "   3", "3333", "   3", "3333" }, { "4  4", "4  4", "4444", "   4", "   4" },
				{ "5555", "5", "5555", "   5", "5555" }, { "6666", "6", "6666", "6  6", "6666" },
				{ "7777", "   7", "   7", "   7", "   7" }, { "8888", "8  8", "8888", "8  8", "8888" },
				{ "9999", "9  9", "9999", "   9", "   9" } };
		char[] num = br.readLine().toCharArray();
		int x;
		for (int i = 0; i < num.length; i++) {
			x = num[i] - '0';
			for (int j = 0; j < 5; j++)
				sb.append(strs[x][j]).append("\n");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
