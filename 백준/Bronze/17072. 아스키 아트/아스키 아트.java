import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] X = new int[] { 2126, 7152, 722 }, Y = new int[] { 510000, 1020000, 1530000, 2040000, Integer.MAX_VALUE };
		char[] ascii = new char[] { '#', 'o', '+', '-', '.' };
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), intensity;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				intensity = 0;
				for (int k = 0; k < 3; k++)
					intensity += X[k] * Integer.parseInt(st.nextToken());
				for (int k = 0; k < Y.length; k++) {
					if (intensity < Y[k]) {
						sb.append(ascii[k]);
						break;
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}