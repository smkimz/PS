import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()) - 1, movement = 2, iteration = 0, row = (4 * N + 3) / 2 + 1,
				col = (4 * N + 1) / 2, dir = 0;
		if (N == 0) {
			System.out.println("*");
			return;
		}
		int[][] dt = { { -1, 0, 1, 0 }, { 0, 1, 0, -1 } };
		boolean[][] map = new boolean[4 * N + 3][4 * N + 1];
		map[row][col] = true;
		while (row != 0 || col != 4 * N) {
			row += dt[0][dir];
			col += dt[1][dir];
			map[row][col] = true;
			++iteration;
			if (iteration % movement != 0)
				continue;
			dir = (dir + 1) % 4;
			if (iteration == movement)
				continue;
			movement += 2;
			iteration = 0;
		}
		for (int i = 0; i < 4 * N + 1; i++)
			sb.append(map[0][i] ? "*" : " ");
		sb.append("\n").append("*").append("\n");
		for (int i = 2; i < 4 * N + 3; i++) {
			for (int j = 0; j < 4 * N + 1; j++)
				sb.append(map[i][j] ? "*" : " ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}