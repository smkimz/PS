import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x, y, cnt = 0;
		StringTokenizer st;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			cnt = 0;
			while (x > 0) {
				cnt += x % 2 == 1 ? 1 : 0;
				x /= 2;
			}
			sb.append(cnt % 2 == y ? "Valid" : "Corrupt").append("\n");
		}
		System.out.print(sb);
	}
}
