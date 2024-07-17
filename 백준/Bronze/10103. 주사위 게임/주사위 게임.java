import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[2], totalScore = { 100, 100 };
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			score[0] = Integer.parseInt(st.nextToken());
			score[1] = Integer.parseInt(st.nextToken());
			if (score[0] > score[1])
				totalScore[1] -= score[0];
			else if (score[0] < score[1])
				totalScore[0] -= score[1];
		}
		System.out.printf("%d\n%d", totalScore[0], totalScore[1]);
	}
}