import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken()), x, res = N;
		char c;
		boolean[] isInfected = new boolean[N + 1];
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			c = st.nextToken().charAt(0);
			if (c == '3') {
				sb.append(res).append("\n");
				continue;
			}
			x = Integer.parseInt(st.nextToken());
			if (c == '1' && !isInfected[x]) {
				isInfected[x] = true;
				--res;
			} else if (c == '2' && isInfected[x]) {
				isInfected[x] = false;
				++res;
			}
		}
		System.out.print(sb);
	}
}