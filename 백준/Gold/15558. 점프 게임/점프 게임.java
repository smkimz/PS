import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), r, c, t;
		char[][] board = new char[2][N + 1];
		board[0] = br.readLine().toCharArray();
		board[1] = br.readLine().toCharArray();
		ArrayDeque<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] { 0, 0, 0 });
		int[] p;
		while (!queue.isEmpty()) {
			p = queue.poll();
			if (p[1] < p[2])
				continue;
			if (p[1] + K >= N) {
				System.out.println(1);
				return;
			}
			t = p[2] + 1;
			c = p[1] + 1;
			if (board[p[0]][c] == '1') {
				queue.add(new int[] { p[0], c, t });
				board[p[0]][c] = '0';
			}
			c = p[1] - 1;
			if (p[1] > p[2] && board[p[0]][c] == '1') {
				queue.add(new int[] { p[0], c, t });
				board[p[0]][c] = '0';
			}
			r = (p[0] + 1) % 2;
			c = p[1] + K;
			if (board[r][c] == '1') {
				queue.add(new int[] { r, c, t });
				board[r][c] = '0';
			}
		}
		System.out.println(0);
	}
}