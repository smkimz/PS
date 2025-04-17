import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken()), L, I, ans = 0;
		boolean[] slot = new boolean[N + 1];
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			I = Integer.parseInt(st.nextToken());
			for (int i = L; i <= N; i += I)
				slot[i] = true;
		}
		for (int i = 1; i <= N; i++)
			ans += slot[i] ? 0 : 1;
		System.out.println(ans);
	}
}