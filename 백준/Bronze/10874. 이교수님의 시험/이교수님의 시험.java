import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), X;
		boolean S;
		int[] A = new int[11];
		for (int i = 1; i <= 10; i++)
			A[i] = (i - 1) % 5 + 1;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			S = false;
			for (int j = 1; j <= 10; j++) {
				X = Integer.parseInt(st.nextToken());
				if (X == A[j])
					continue;
				S = true;
				break;
			}
			if (!S)
				sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
}