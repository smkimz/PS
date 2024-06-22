import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M, area;
	static boolean[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		area = N * M;
		map = new boolean[N + 2][M + 2];
		int Q = Integer.parseInt(st.nextToken());
		int[] query = new int[4];
		char order;
		while (Q-- > 0) {
			st = new StringTokenizer(br.readLine());
			order = st.nextToken().charAt(0);
			switch (order) {
			case '1':
				for (int i = 0; i <= 3; i++)
					query[i] = Integer.parseInt(st.nextToken());
				runRobot(query);
				break;
			case '2':
				for (int i = 0; i <= 1; i++)
					query[i] = Integer.parseInt(st.nextToken());
				sb.append(map[query[0]][query[1]] ? '1' : '0').append("\n");
				break;
			case '3':
				sb.append(area).append("\n");
				break;
			default:
				break;
			}
		}
		System.out.print(sb);
	}

	static void runRobot(int[] query) {
		int row = query[2], col = query[3];
		while (!map[row][col] && row >= 1 && row <= N && col >= 1 && col <= M) {
			area--;
			map[row][col] = true;
			row += query[0];
			col += query[1];
		}
	}
}
