import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), k, max = 0;
		int[] X = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		N *= 2;
		for (int i = 1; i <= N; i++) {
			k = Integer.parseInt(st.nextToken());
			if (X[k] != 0)
				max = Math.max(max, i - X[k] - 1);
			else
				X[k] = i;
		}
		System.out.println(max);
	}
}
