import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken());
		if (K == 1) {
			if (X == 1) {
				if (Y == 1)
					sb.append("1 1\n").append("-1 1");
				else if (Y == 2)
					sb.append("-1 1\n").append("1 1");
			} else if (X == 2) {
				if (Y == 1)
					sb.append("1 1\n").append("1 -1");
				else if (Y == 2)
					sb.append("1 -1\n").append("1 1");
			}
		} else {
			if (X == 1) {
				if (Y == 1)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 1 3 2\n").append("-1 1 2 2");
				else if (Y == 2)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("-1 1 3 2\n").append("1 1 2 2");
				else if (Y == 3)
					sb.append("4 4 5 5\n").append("-1 4 3 5\n").append("1 3 3 2\n").append("1 1 2 2");
				else if (Y == 4)
					sb.append("-1 4 5 5\n").append("4 4 3 5\n").append("1 3 3 2\n").append("1 1 2 2");
			} else if (X == 2) {
				if (Y == 1)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 1 3 2\n").append("1 -1 2 2");
				else if (Y == 2)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 -1 3 2\n").append("1 1 2 2");
				else if (Y == 3)
					sb.append("4 4 5 5\n").append("4 -1 3 5\n").append("1 3 3 2\n").append("1 1 2 2");
				else if (Y == 4)
					sb.append("4 -1 5 5\n").append("4 4 3 5\n").append("1 3 3 2\n").append("1 1 2 2");
			} else if (X == 3) {
				if (Y == 1)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 3 2 2\n").append("1 1 -1 2");
				else if (Y == 2)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 3 -1 2\n").append("1 1 2 2");
				else if (Y == 3)
					sb.append("4 4 5 5\n").append("4 3 -1 5\n").append("1 3 3 2\n").append("1 1 2 2");
				else if (Y == 4)
					sb.append("4 4 -1 5\n").append("4 3 5 5\n").append("1 3 3 2\n").append("1 1 2 2");
			} else if (X == 4) {
				if (Y == 1)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 3 2 2\n").append("1 1 2 -1");
				else if (Y == 2)
					sb.append("4 4 5 5\n").append("4 3 3 5\n").append("1 3 2 -1\n").append("1 1 2 2");
				else if (Y == 3)
					sb.append("4 4 5 5\n").append("4 3 5 -1\n").append("1 3 3 2\n").append("1 1 2 2");
				else if (Y == 4)
					sb.append("4 4 5 -1\n").append("4 3 5 5\n").append("1 3 3 2\n").append("1 1 2 2");
			}
		}
		System.out.println(sb);
	}
}