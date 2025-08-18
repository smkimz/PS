import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()),
				C = Integer.parseInt(st.nextToken());
		boolean flag = R % 2 == C % 2 ? false : true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i % 2 != j % 2)
					sb.append(flag ? 'v' : '.');
				else
					sb.append(flag ? '.' : 'v');
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}