import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] table = new int[][] { { 0, 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6 },
				{ 0, 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773 } };
		int N = Integer.parseInt(br.readLine());
		sb.append(table[0][N]).append(' ').append(table[1][N]);
		System.out.print(sb);
	}
}