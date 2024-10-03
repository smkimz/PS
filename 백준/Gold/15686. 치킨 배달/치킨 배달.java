import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M, house, chicken, ans;
	static int[][] housePos, chickenPos;
	static int[] selected;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][N];
		house = 0;
		chicken = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1)
					house++;
				else if (map[i][j] == 2)
					chicken++;
			}
		}
		int nIdx = 0, cIdx = 0;
		housePos = new int[house][2];
		chickenPos = new int[chicken][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					housePos[nIdx][0] = i;
					housePos[nIdx][1] = j;
					nIdx++;
				} else if (map[i][j] == 2) {
					chickenPos[cIdx][0] = i;
					chickenPos[cIdx][1] = j;
					cIdx++;
				}
			}
		}
		ans = Integer.MAX_VALUE;
		selected = new int[M];
		selectChicken(0, 0);
		System.out.println(ans);
	}

	public static void selectChicken(int sidx, int idx) {
		if (sidx == M) {
			int sum = 0;
			for (int i = 0; i < house; i++) {
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < M; j++) {
					int dist = Math.abs(housePos[i][0] - chickenPos[selected[j]][0])
							+ Math.abs(housePos[i][1] - chickenPos[selected[j]][1]);
					if (min > dist)
						min = dist;
				}
				sum += min;
			}
			ans = Math.min(ans, sum);
			return;
		}
		if (idx == chicken)
			return;
		selected[sidx] = idx;
		selectChicken(sidx + 1, idx + 1);
		selectChicken(sidx, idx + 1);
	}
}
