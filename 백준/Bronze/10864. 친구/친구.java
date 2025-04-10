import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int[] friends = new int[N + 1];
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			++friends[Integer.parseInt(st.nextToken())];
			++friends[Integer.parseInt(st.nextToken())];
		}
		for (int i = 1; i <= N; i++)
			sb.append(friends[i]).append("\n");
		System.out.print(sb);
	}
}