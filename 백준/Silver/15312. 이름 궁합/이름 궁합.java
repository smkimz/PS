import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] strokes = new int[] { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 }, Y;
		char[][] X = new char[2][];
		X[0] = br.readLine().toCharArray();
		X[1] = br.readLine().toCharArray();
		int len = X[0].length;
		Y = new int[len * 2];
		for (int i = 0; i < len; i++) {
			Y[2 * i] = strokes[X[0][i] - 'A'];
			Y[2 * i + 1] = strokes[X[1][i] - 'A'];
		}
		len *= 2;
		while (--len > 1) {
			for (int i = 0; i < len; i++)
				Y[i] = (Y[i] + Y[i + 1]) % 10;
		}
		System.out.printf("%d%d", Y[0], Y[1]);
	}
}