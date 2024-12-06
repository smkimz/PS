import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, PB = 1;
	static int[] A, X;
	static boolean solved = false;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		X = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			PB *= Integer.parseInt(st.nextToken());
			X[i] = 9;
		}

		selectCard(0, 1, 1);
		if (solved) {
			for (int i = 0; i < N; i++)
				sb.append(X[i]).append(" ");
			System.out.print(sb);
		} else
			System.out.print(-1);
	}

	static void selectCard(int s, int t, int pa) {
		if (solved)
			return;
		if (s == N) {
			if (pa <= PB)
				return;
			for (int i = 0; i < N; i++) {
				if (A[i] > X[i])
					return;
				else if (A[i] < X[i])
					break;
			}
			for (int i = 0; i < N; i++)
				X[i] = A[i];
			solved = true;
			return;
		}

		for (int i = t; i <= 9; i++) {
			A[s] = i;
			selectCard(s + 1, i, pa * i);
		}
	}
}