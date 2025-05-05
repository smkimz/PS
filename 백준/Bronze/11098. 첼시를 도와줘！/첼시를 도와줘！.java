import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), P, C, max;
		String name;
		while (--N >= 0) {
			P = Integer.parseInt(br.readLine());
			max = 0;
			name = "";
			while (--P >= 0) {
				st = new StringTokenizer(br.readLine());
				C = Integer.parseInt(st.nextToken());
				if (C > max) {
					max = C;
					name = st.nextToken();
				}
			}
			sb.append(name).append("\n");
		}
		System.out.print(sb);
	}
}