import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] table = new int['Z']['Z'];
		table['R']['S'] = 1;
		table['R']['P'] = -1;
		table['S']['R'] = -1;
		table['S']['P'] = 1;
		table['P']['R'] = 1;
		table['P']['S'] = -1;
		int N = Integer.parseInt(br.readLine()), res, x = 0, y = 0;
		char[] S = br.readLine().toCharArray(), T = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			res = table[S[i]][T[i]];
			if (res > 0)
				++x;
			else if (res < 0)
				++y;
		}
		System.out.printf("%d %d", x, y);
	}
}
