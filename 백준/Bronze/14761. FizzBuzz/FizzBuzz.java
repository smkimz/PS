import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken()),
				N = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) {
			if (i % X == 0 || i % Y == 0) {
				if (i % X == 0)
					sb.append("Fizz");
				if (i % Y == 0)
					sb.append("Buzz");
			} else
				sb.append(i);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}