import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] memo = new int[101];
		for (int i = 1; i <= 100; i++)
			memo[i] = (int) Math.pow(i, 2) + memo[i - 1];
		int N;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			sb.append(memo[N]).append("\n");
		}
		System.out.print(sb);
	}
}