import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, H, B, K;
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if (H >= B)
				continue;
			K = Integer.parseInt(st.nextToken());
			ans += K * (B - H);
		}
		System.out.println(ans);
	}
}