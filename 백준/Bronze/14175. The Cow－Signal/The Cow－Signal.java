import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken());
		char[] str;
		for (int i = 0; i < M; i++) {
			str = br.readLine().toCharArray();
			for (int a = 0; a < K; a++) {
				for (int b = 0; b < N; b++) {
					for (int c = 0; c < K; c++)
						sb.append(str[b]);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
