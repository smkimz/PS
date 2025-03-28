import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		char[] bitmap;
		for (int i = 0; i < N; i++) {
			bitmap = br.readLine().replace(" ", "").toCharArray();
			for (int a = 0; a < K; a++) {
				for (int b = 0; b < N; b++) {
					for (int c = 0; c < K; c++)
						sb.append(bitmap[b]).append(" ");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}