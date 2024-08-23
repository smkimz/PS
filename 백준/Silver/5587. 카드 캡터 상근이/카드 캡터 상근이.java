import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = 2 * N, R = 0, num = 0;
		boolean[][] cards = new boolean[2][M + 1];
		int[] cardCount = { N, N };
		for (int i = 0; i < N; i++)
			cards[0][Integer.parseInt(br.readLine())] = true;
		for (int i = 1; i <= M; i++) {
			if (!cards[0][i])
				cards[1][i] = true;
		}
		p: while (cardCount[0] > 0 && cardCount[1] > 0) {
			for (int i = num + 1; i <= M; i++) {
				if (!cards[R][i])
					continue;
				num = i;
				cards[R][i] = false;
				--cardCount[R];
				R = (R + 1) % 2;
				continue p;
			}
			num = 0;
			R = (R + 1) % 2;
		}
		sb.append(cardCount[1]).append("\n").append(cardCount[0]);
		System.out.print(sb);
	}
}