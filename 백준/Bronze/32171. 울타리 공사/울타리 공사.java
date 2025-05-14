import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), max = 0;
		int[] X = new int[4], Y = new int[] { 11, 11, -11, -11 };
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++)
				X[i] = Integer.parseInt(st.nextToken());
			Y[0] = Math.min(Y[0], Math.min(X[0], X[2]));
			Y[1] = Math.min(Y[1], Math.min(X[1], X[3]));
			Y[2] = Math.max(Y[2], Math.max(X[0], X[2]));
			Y[3] = Math.max(Y[3], Math.max(X[1], X[3]));
			max = Math.max(max, (Y[2] - Y[0] + Y[3] - Y[1]) * 2);
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
}