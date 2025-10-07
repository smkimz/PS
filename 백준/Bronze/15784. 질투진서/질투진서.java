import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken()), x, p = 0, max = 0;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				if (i != a && j != b) {
					st.nextToken();
					continue;
				}
				x = Integer.parseInt(st.nextToken());
				if (i == a && j == b) {
					p = x;
					continue;
				}
				max = Math.max(max, x);
			}
		}
		System.out.println(p >= max ? "HAPPY" : "ANGRY");
	}
}