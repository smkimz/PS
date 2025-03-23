import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), f, d, dist, maxDist = 200001,
				ans = 0;
		for (int i = 1; i <= K; i++) {
			st = new StringTokenizer(br.readLine());
			f = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			dist = (f - 1) + (M + 1 - d);
			if (dist >= maxDist)
				continue;
			ans = i;
			maxDist = dist;
		}
		System.out.println(ans);
	}
}