import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), S, T, ans = -1;
		while(--N >= 0) {
			st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			T = Integer.parseInt(st.nextToken());
			if(S+T > X)
				continue;
			ans = Math.max(ans, S);
		}
		System.out.println(ans);
	}
}
