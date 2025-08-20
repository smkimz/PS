import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
		if (N == R) {
			System.out.println('*');
			return;
		}
		boolean[] survivors = new boolean[N + 1];
		st = new StringTokenizer(br.readLine());
		while (--R >= 0)
			survivors[Integer.parseInt(st.nextToken())] = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (!survivors[i])
				sb.append(i).append(' ');
		}
		System.out.print(sb);
	}
}