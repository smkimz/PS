import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int start, end, diff;
		int[][] cards = new int[2][21];
		for (int i = 1; i <= 20; i++) {
			cards[0][i] = i;
			cards[1][i] = i;
		}
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			diff = end - start;
			for (int j = 0; j <= diff; j++)
				cards[1][start + j] = cards[0][end - j];
			for (int j = start; j <= end; j++)
				cards[0][j] = cards[1][j];
		}
		for (int i = 1; i <= 20; i++)
			sb.append(cards[0][i]).append(" ");
		System.out.print(sb);
	}
}