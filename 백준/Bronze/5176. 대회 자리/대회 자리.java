import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int K = Integer.parseInt(br.readLine()), P, M, S, Q;
		boolean[] seats;
		while (--K >= 0) {
			st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			seats = new boolean[M + 1];
			Q = 0;
			for (int i = 0; i < P; i++) {
				S = Integer.parseInt(br.readLine());
				if (seats[S])
					continue;
				seats[S] = true;
				++Q;
			}
			sb.append(P - Q).append("\n");
		}
		System.out.print(sb);
	}

}