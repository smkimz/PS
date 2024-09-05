import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int R, C, val = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = (int) Math.pow(2, Integer.parseInt(st.nextToken()));
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		divideArea(0, 0, N);
	}

	static void divideArea(int row, int col, int size) {
		if (R < row || R > row + size - 1 || C < col || C > col + size - 1) {
			val += size * size;
			return;
		}
		if (size == 1) {
			System.out.println(val);
			return;
		}
		int hSize = size / 2;
		int[][] dt = { { 0, 0, hSize, hSize }, { 0, hSize, 0, hSize } };
		for (int i = 0; i < 4; i++)
			divideArea(row + dt[0][i], col + dt[1][i], hSize);
	}
}