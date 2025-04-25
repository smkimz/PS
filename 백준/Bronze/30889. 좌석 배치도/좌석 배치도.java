import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[][] seats = new boolean[10][21];
		int N = Integer.parseInt(br.readLine()), col;
		char[] seat;
		while (--N >= 0) {
			seat = br.readLine().toCharArray();
			col = 0;
			for (int i = 1; i < seat.length; i++)
				col = col * 10 + seat[i] - '0';
			seats[seat[0] - 'A'][col] = true;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 21; j++)
				sb.append(seats[i][j] ? 'o' : '.');
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
