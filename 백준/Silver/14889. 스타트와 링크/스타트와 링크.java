import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, ans = Integer.MAX_VALUE;
	static int[][] skill;
	static boolean[] team;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		skill = new int[N][N];
		team = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				skill[i][j] = Integer.parseInt(st.nextToken());
		}
		generateCombination(0, 0);
		System.out.println(ans);
	}

	static void generateCombination(int num, int cnt) {
		if (cnt == N / 2) {
			calculateSkill();
			return;
		}
		if (num == N || N / 2 < num - cnt)
			return;
		team[num] = true;
		generateCombination(num + 1, cnt + 1);
		team[num] = false;
		generateCombination(num + 1, cnt);
	}

	static void calculateSkill() {
		int skillA = 0, skillB = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (team[i] && team[j])
					skillA += skill[i][j];
				else if (!team[i] && !team[j])
					skillB += skill[i][j];
			}
		}
		ans = Math.min(ans, Math.abs(skillA - skillB));
	}
}