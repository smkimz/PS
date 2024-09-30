import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static int N, M, H;
	static int[][][] box;
	static int[][] dt = { { 0, 0, 0, 0, 1, -1 }, { 0, 1, 0, -1, 0, 0 }, { 1, 0, -1, 0, 0, 0 } };

	static class Tomato {
		int height, row, col;

		public Tomato(int height, int row, int col) {
			this.height = height;
			this.row = row;
			this.col = col;
		}
	}

	static ArrayDeque<Tomato> queue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		box = new int[H][N][M];
		queue = new ArrayDeque<>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					box[i][j][k] = Integer.parseInt(st.nextToken());
					if (box[i][j][k] == 1)
						queue.add(new Tomato(i, j, k));
				}
			}
		}
		bfs();
	}

	static void bfs() {
		int dh, dr, dc;
		Tomato tomato;
		while (!queue.isEmpty()) {
			tomato = queue.poll();
			for (int i = 0; i <= 5; i++) {
				dh = tomato.height + dt[0][i];
				dr = tomato.row + dt[1][i];
				dc = tomato.col + dt[2][i];
				if (isValidArea(dh, dr, dc)) {
					box[dh][dr][dc] = box[tomato.height][tomato.row][tomato.col] + 1;
					queue.add(new Tomato(dh, dr, dc));
				}
			}
		}
		checkBoxStatus();
	}

	static void checkBoxStatus() {
		int max = 0;
		p: for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (box[i][j][k] == 0) {
						max = 0;
						break p;
					}
					max = Math.max(max, box[i][j][k]);
				}
			}
		}
		System.out.println(max - 1);
	}

	public static boolean isValidArea(int dh, int dr, int dc) {
		return dh >= 0 && dh <= H - 1 && dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= M - 1 && box[dh][dr][dc] == 0;
	}
}