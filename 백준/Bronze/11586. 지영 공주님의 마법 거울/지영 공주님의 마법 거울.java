import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[][] face = new char[N][N];
		for (int i = 0; i < N; i++)
			face[i] = br.readLine().toCharArray();
		char K = br.readLine().charAt(0);
		if (K == '1') {
			for (int i = 0; i < N; i++)
				sb.append(face[i]).append("\n");
		} else if (K == '2') {
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--)
					sb.append(face[i][j]);
				sb.append("\n");
			}
		} else if (K == '3') {
			for (int i = N - 1; i >= 0; i--) {
				for (int j = 0; j < N; j++)
					sb.append(face[i][j]);
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}