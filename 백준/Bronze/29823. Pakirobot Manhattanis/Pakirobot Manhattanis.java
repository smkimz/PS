import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a, x = 0, y = 0;
		char[] input = br.readLine().toCharArray();
		int[] idx = new int['X'];
		idx['N'] = 1;
		idx['E'] = 2;
		idx['S'] = 3;
		idx['W'] = 4;
		int[][] dt = new int[][] { { 0, 0, 1, 0, -1 }, { 0, 1, 0, -1, 0 } };
		for (int i = 0; i < N; i++) {
			a = idx[input[i]];
			x += dt[0][a];
			y += dt[1][a];
		}
		System.out.print(Math.abs(x) + Math.abs(y));
	}
}