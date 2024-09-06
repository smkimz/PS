import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static char[] signs = { ' ', '+', '-' }, numbers = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' }, S;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			M = 2 * N - 1;
			S = new char[M];
			selectSign(1);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void selectSign(int num) {
		if (num == N) {
			S[M - 1] = numbers[num];
			int n = 0, sum = 0, coefficient = 1;
			for (int i = 0; i < 2 * N - 1; i++) {
				if (i % 2 == 0) {
					n = n * 10 + S[i] - '0';
					continue;
				}

				if (S[i] == ' ')
					continue;

				sum += n * coefficient;
				if (S[i] == '+')
					coefficient = 1;
				else if (S[i] == '-')
					coefficient = -1;
				n = 0;
			}

			sum += n * coefficient;
			if (sum == 0) {
				for (int i = 0; i < N - 1; i++)
					sb.append(S[2 * i]).append(S[2 * i + 1]);
				sb.append(N).append("\n");
			}

			return;
		}

		for (int i = 0; i < 3; i++) {
			S[num * 2 - 2] = numbers[num];
			S[num * 2 - 1] = signs[i];
			selectSign(num + 1);
		}
	}
}