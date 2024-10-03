import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static final int[] SCORES = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38,
			40, 13, 16, 19, 22, 24, 28, 27, 26, 25, 30, 35, 0 };
	static final int END = 32;
	static int[] move = new int[10];
	static int[] position = new int[4];
	static int ans = 0;
	static ArrayList<Integer>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		init();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++)
			move[i] = Integer.parseInt(st.nextToken());
		checkMovement(0, 0);
		System.out.println(ans);
	}

	static void init() {
		adjList = new ArrayList[END + 1];
		for (int i = 0; i <= END; i++)
			adjList[i] = new ArrayList<Integer>();
		for (int i = 0; i <= 19; i++)
			adjList[i].add(i + 1);
		adjList[5].add(21);
		adjList[21].add(22);
		adjList[22].add(23);
		adjList[23].add(29);
		adjList[10].add(24);
		adjList[24].add(25);
		adjList[25].add(29);
		adjList[15].add(26);
		adjList[26].add(27);
		adjList[27].add(28);
		adjList[28].add(29);
		adjList[29].add(30);
		adjList[30].add(31);
		adjList[31].add(20);
		adjList[20].add(END);
	}

	static void checkMovement(int turn, int score) {
		if (turn == 10) {
			ans = Math.max(ans, score);
			return;
		}
		int m, p, q;
		p: for (int i = 0; i <= 3; i++) {
			if (position[i] == END)
				continue;
			p = position[i];
			m = move[turn];
			if (p == 5 || p == 10 || p == 15) {
				p = adjList[p].get(1);
				--m;
			}
			while (m > 0 && p < END) {
				p = adjList[p].get(0);
				--m;
			}
			if (p < END) {
				for (int j = 0; j <= 3; j++) {
					if (i == j)
						continue;
					if (p == position[j]) {
						continue p;
					}
				}
			}
			q = position[i];
			position[i] = p;
			checkMovement(turn + 1, score + SCORES[position[i]]);
			position[i] = q;
		}
	}
}