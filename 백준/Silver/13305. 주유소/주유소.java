import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), price = 0;
		int[] dist = new int[N - 1];
		long ans = 0, min = Long.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N - 1; i++)
			dist[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N - 1; i++) {
			price = Integer.parseInt(st.nextToken());
			if (price < min)
				min = price;
			ans += dist[i] * min;
		}
		System.out.println(ans);
	}
}
