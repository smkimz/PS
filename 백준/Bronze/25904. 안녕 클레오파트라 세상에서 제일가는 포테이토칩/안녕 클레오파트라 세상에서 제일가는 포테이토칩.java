import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), p = 1;
		int[] T = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			T[i] = Integer.parseInt(st.nextToken());
		while (true) {
			if (T[p] < X)
				break;
			++X;
			++p;
			if (p > N)
				p = 1;
		}
		System.out.println(p);
	}
}