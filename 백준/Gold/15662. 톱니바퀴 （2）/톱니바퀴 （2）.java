import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T;
	static char[][] cogwheels;
	static int[][] idx;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine());
		cogwheels = new char[T][8];
		idx = new int[T][2];
		for (int i = 0; i < T; i++) {
			cogwheels[i] = br.readLine().toCharArray();
			idx[i][0] = 6;
			idx[i][1] = 2;
		}

		int K = Integer.parseInt(br.readLine()), num, dir, ans = 0;
		while (--K >= 0) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken()) - 1;
			dir = Integer.parseInt(st.nextToken()) * -1;
			checkLeftWheel(num - 1, dir);
			checkRightWheel(num + 1, dir);
			rotateWheel(num, dir * -1);
		}

		for (int i = 0; i < T; i++) {
			if (cogwheels[i][(idx[i][0] + 2) % 8] == '1')
				++ans;
		}

		System.out.println(ans);
	}

	static void checkLeftWheel(int num, int dir) {
		if (num < 0 || cogwheels[num][idx[num][1]] == cogwheels[num + 1][idx[num + 1][0]])
			return;
		checkLeftWheel(num - 1, dir * -1);
		rotateWheel(num, dir);
	}

	static void checkRightWheel(int num, int dir) {
		if (num >= T || cogwheels[num][idx[num][0]] == cogwheels[num - 1][idx[num - 1][1]])
			return;
		checkRightWheel(num + 1, dir * -1);
		rotateWheel(num, dir);
	}

	static void rotateWheel(int num, int dir) {
		if (dir == -1) {
			idx[num][0] = (idx[num][0] + 1) % 8;
			idx[num][1] = (idx[num][1] + 1) % 8;
		} else {
			idx[num][0] = (idx[num][0] + 7) % 8;
			idx[num][1] = (idx[num][1] + 7) % 8;
		}
	}
}