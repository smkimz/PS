import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] chars = new char[][] { {},
				{ 'A', 'D', 'O', 'P', 'Q', 'R', 'a', 'b', 'd', 'e', 'g', 'o', 'p', 'q', '@' }, { 'B' } };
		int[] holes = new int[128];
		for (int i = 1; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++)
				holes[chars[i][j]] = i;
		}
		int ans = 0;
		char[] S = br.readLine().toCharArray();
		for (int i = 0; i < S.length; i++)
			ans += holes[S[i]];
		System.out.println(ans);
	}
}