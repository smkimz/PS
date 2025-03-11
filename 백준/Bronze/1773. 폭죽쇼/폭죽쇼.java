import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken()), t, ans = 0;
		boolean[] firework = new boolean[C + 1];
		while (--N >= 0) {
			t = Integer.parseInt(br.readLine());
			for (int i = t; i <= C; i += t) {
				if (firework[i])
					continue;
				firework[i] = true;
				++ans;
			}
		}
		System.out.println(ans);
	}
}