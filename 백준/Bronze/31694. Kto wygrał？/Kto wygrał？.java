import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] scores = new int[2][11];
		int[] score = new int[2];
		int x;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
				++scores[i][x];
				score[i] += x;
			}
		}
		if (score[0] != score[1]) {
			System.out.println(score[0] > score[1] ? "Algosia" : "Bajtek");
			return;
		}
		for (int i = 10; i >= 0; i--) {
			if (scores[0][i] == scores[1][i])
				continue;
			System.out.println(scores[0][i] > scores[1][i] ? "Algosia" : "Bajtek");
			return;
		}
		System.out.println("remis");
	}
}