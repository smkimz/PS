import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static int N, dir = 0, num, ans;
	static int[][] map, dt = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	static class Order {
		int time, dir;

		public Order(int time, int dir) {
			this.time = time;
			this.dir = dir;
		}
	}

	static class Snake {
		int row, col;

		public Snake(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static ArrayDeque<Order> order;
	static ArrayDeque<Snake> snake;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine()), row, col;
		map = new int[N][N];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken()) - 1;
			col = Integer.parseInt(st.nextToken()) - 1;
			map[row][col] = 9;
		}
		map[0][0] = 1;
		int L = Integer.parseInt(br.readLine()), time, dir;
		order = new ArrayDeque<>();
		for (int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine());
			time = Integer.parseInt(st.nextToken());
			dir = st.nextToken().charAt(0) == 'L' ? 3 : 1;
			order.add(new Order(time, dir));
		}
		snake = new ArrayDeque<>();
		snake.add(new Snake(0, 0));
		snakeMove(0);
	}

	static void snakeMove(int time) {
		Snake head = snake.peekFirst(), tail = snake.peekLast();
		if (!order.isEmpty() && order.peek().time == time) {
			Order rotate = order.poll();
			dir = (dir + rotate.dir) % 4;
		}
		int dr = head.row + dt[0][dir], dc = head.col + dt[1][dir];
		if (dr >= 0 && dr <= N - 1 && dc >= 0 && dc <= N - 1) {
			if (map[dr][dc] != 1) {
				if (map[dr][dc] != 9) {
					map[tail.row][tail.col] = 0;
					snake.removeLast();
				}
				map[dr][dc] = 1;
				snake.offerFirst(new Snake(dr, dc));
			} else {
				System.out.println(time + 1);
				return;
			}
		} else {
			System.out.println(time + 1);
			return;
		}
		snakeMove(time + 1);
	}
}