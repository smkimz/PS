import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()), dr, dc, sea;
		char[][] map = new char[R][C];
		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();
		int[][] dt = new int[][] { { 1, 0, -1, 0 }, { 0, 1, 0, -1 } };
		int[] border = new int[4];
		border[0] = 10;
		border[2] = 10;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == '.')
					continue;
				sea = 0;
				for (int k = 0; k < 4; k++) {
					dr = i + dt[0][k];
					dc = j + dt[1][k];
					if (dr < 0 || dr >= R || dc < 0 || dc >= C || map[dr][dc] == '.')
						++sea;
				}
				if (sea >= 3)
					map[i][j] = 'O';
				else {
					border[0] = Math.min(border[0], i);
					border[1] = Math.max(border[1], i);
					border[2] = Math.min(border[2], j);
					border[3] = Math.max(border[3], j);
				}
			}
		}

		for (int i = border[0]; i <= border[1]; i++) {
			for (int j = border[2]; j <= border[3]; j++) {
				if (map[i][j] == 'X')
					sb.append("X");
				else
					sb.append(".");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}