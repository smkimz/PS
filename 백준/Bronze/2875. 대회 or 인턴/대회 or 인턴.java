import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken()), X;
		X = Math.min(N / 2, M);
		N -= X * 2;
		M -= X;
		K -= N + M;
		if (K > 0)
			X -= K % 3 == 0 ? K / 3 : K / 3 + 1;
		System.out.println(X);
	}
}