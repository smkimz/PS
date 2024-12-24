import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), S, N;
		while (--T >= 0) {
			S = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				S += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			sb.append(S).append("\n");
		}
		System.out.print(sb);
	}
}