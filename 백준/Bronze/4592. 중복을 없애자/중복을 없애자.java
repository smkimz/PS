import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N, x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if (N == 0)
				break;
			x = 0;
			while (--N >= 0) {
				y = Integer.parseInt(st.nextToken());
				if (x == y)
					continue;
				sb.append(y).append(" ");
				x = y;
			}
			sb.append("$\n");
		}
		System.out.print(sb);
	}
}