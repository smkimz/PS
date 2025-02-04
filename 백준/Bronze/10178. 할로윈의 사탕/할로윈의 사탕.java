import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), X, Y;
		StringTokenizer st;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			sb.append("You get ").append(X / Y).append(" piece(s) and your dad gets ").append(X % Y)
					.append(" piece(s).\n");
		}
		System.out.print(sb);
	}
}