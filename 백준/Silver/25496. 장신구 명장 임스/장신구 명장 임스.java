import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = 200 - Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), ans = 0;
		int[] costs = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			costs[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(costs);
		for (int i = 0; i < N; i++) {
			if (P <= 0)
				break;
			P -= costs[i];
			++ans;
		}
		System.out.println(ans);
	}
}