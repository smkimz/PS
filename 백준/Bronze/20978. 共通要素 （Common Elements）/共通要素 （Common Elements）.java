import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] X = new int[2];
		boolean[][] Y = new boolean[2][101];
		int A;
		X[0] = Integer.parseInt(st.nextToken());
		X[1] = Integer.parseInt(st.nextToken());
		for (int i = 0; i <= 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < X[i]; j++) {
				A = Integer.parseInt(st.nextToken());
				Y[i][A] = true;
			}
		}
		for (int i = 1; i <= 100; i++) {
			if (Y[0][i] && Y[1][i])
				sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
}
