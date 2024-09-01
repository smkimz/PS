import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, R, C, val = 0;
	static int[][] dt = { { 0, 0, 1, 1 }, { 0, 1, 0, 1 } };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = (int) Math.pow(2, Integer.parseInt(st.nextToken()));
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		divideArea(0, 0, N);
	}

	static void divideArea(int row, int col, int size) {
		if (size == 2) {
			numberArr(row, col);
			return;
		}
		if (R < row || R > row + size - 1 || C < col || C > col + size - 1) {
			val += size * size;
			return;
		}
		int hSize = size / 2;
		int[][] divDelta = { { 0, 0, hSize, hSize }, { 0, hSize, 0, hSize } };
		for (int i = 0; i < 4; i++)
			divideArea(row + divDelta[0][i], col + divDelta[1][i], hSize);
	}

	static void numberArr(int row, int col) {
		for (int i = 0; i < 4; i++) {
			if (row + dt[0][i] == R && col + dt[1][i] == C) {
				System.out.println(val);
				return;
			}
			++val;
		}
	}
}