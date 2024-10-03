import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final int END = 32, MOVECOUNT = 10, MAXMOVE = 5, MEEPLE = 4;
	static final int[] SCORES = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38,
			40, 13, 16, 19, 22, 24, 28, 27, 26, 25, 30, 35, 0 };
	static final int[][] ADJNODES = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 },
			{ 4, 5, 6, 7, 8 }, { 5, 6, 7, 8, 9 }, { 21, 22, 23, 29, 30 }, { 7, 8, 9, 10, 11 }, { 8, 9, 10, 11, 12 },
			{ 9, 10, 11, 12, 13 }, { 10, 11, 12, 13, 14 }, { 24, 25, 29, 30, 31 }, { 12, 13, 14, 15, 16 },
			{ 13, 14, 15, 16, 17 }, { 14, 15, 16, 17, 18 }, { 15, 16, 17, 18, 19 }, { 26, 27, 28, 29, 30 },
			{ 17, 18, 19, 20, 32 }, { 18, 19, 20, 32, 32 }, { 19, 20, 32, 32, 32 }, { 20, 32, 32, 32, 32 },
			{ 32, 32, 32, 32, 32 }, { 22, 23, 29, 30, 31 }, { 23, 29, 30, 31, 20 }, { 29, 30, 31, 20, 32 },
			{ 25, 29, 30, 31, 20 }, { 29, 30, 31, 20, 32 }, { 27, 28, 29, 30, 31 }, { 28, 29, 30, 31, 20 },
			{ 29, 30, 31, 20, 32 }, { 30, 31, 20, 32, 32 }, { 31, 20, 32, 32, 32 }, { 20, 32, 32, 32, 32 } };
	static int[] move = new int[MOVECOUNT];
	static int[] position = new int[MEEPLE];
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < MOVECOUNT; i++)
			move[i] = Integer.parseInt(st.nextToken());
		checkMovement(0, 0);
		System.out.println(ans);
	}

	private static void checkMovement(int turn, int score) {
		if (turn == MOVECOUNT) {
			ans = Math.max(ans, score);
			return;
		}
		int nextPos, pos;
		for (int i = 0; i < MEEPLE; i++) {
			if (position[i] == END)
				continue;
			pos = position[i];
			nextPos = ADJNODES[pos][move[turn] - 1];
			if (isSameNode(i, nextPos))
				continue;
			position[i] = nextPos;
			checkMovement(turn + 1, score + SCORES[position[i]]);
			position[i] = pos;
		}
	}

	private static boolean isSameNode(int m, int pos) {
		if (pos == END)
			return false;
		for (int i = 0; i < MEEPLE; i++) {
			if (m == i)
				continue;
			if (pos == position[i])
				return true;
		}
		return false;
	}
}