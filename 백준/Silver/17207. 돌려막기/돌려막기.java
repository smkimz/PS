import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] names = { "Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki" };
		int[][][] arr = new int[2][5][5];
		int work, min = Integer.MAX_VALUE, idx = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 5; k++)
					arr[i][j][k] = Integer.parseInt(st.nextToken());
			}
		}

		for (int x = 0; x < 5; x++) {
			work = 0;
			for (int y = 0; y < 5; y++) {
				for (int i = 0; i < 5; i++)
					work += arr[0][x][i] * arr[1][i][y];
			}
			if (work <= min) {
				min = work;
				idx = x;
			}
		}

		System.out.println(names[idx]);
	}
}