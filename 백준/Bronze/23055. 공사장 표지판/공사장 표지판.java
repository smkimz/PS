import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++)
			sb.append('*');
		sb.append("\n");
		for (int i = 1; i <= N - 2; i++) {
			for (int j = 0; j < N; j++) {
				if (j == 0 || j == N - 1 || j == i || j == N - i - 1)
					sb.append('*');
				else
					sb.append(' ');
			}
			sb.append("\n");
		}
		if (N != 1)
			for (int i = 0; i < N; i++)
				sb.append('*');
		System.out.print(sb);
	}
}