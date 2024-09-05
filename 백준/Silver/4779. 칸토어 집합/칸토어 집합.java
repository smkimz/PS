import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static char[] cantor;
	static int N;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		while ((input = br.readLine()) != null) {
			N = (int) Math.pow(3, Integer.parseInt(input));
			cantor = new char[N];
			Arrays.fill(cantor, '-');
			recur(0, N);
			for (int i = 0; i < N; i++)
				sb.append(cantor[i]);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void recur(int p, int len) {
		if (len == 1)
			return;
		int start = p + len / 3, end = p + len * 2 / 3;
		for (int i = start; i < end; i++)
			cantor[i] = ' ';
		recur(p, len / 3);
		recur(end, len / 3);
	}
}