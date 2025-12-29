import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] M = new int[11];
		for (int i = 0; i <= 10; i++)
			M[i] = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine()), B, S, ans = 0;
		float L;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			B = Integer.parseInt(st.nextToken());
			L = Float.parseFloat(st.nextToken());
			S = Integer.parseInt(st.nextToken());
			if (L < 2.0 || S < 17)
				continue;
			ans += M[B];
		}
		System.out.println(ans);
	}
}
