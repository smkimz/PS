import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ability = new int[2 * N];
		for (int i = 0; i < 2 * N; i++)
			ability[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(ability);
		for (int i = 0; i < N; i++)
			ans = Math.min(ans, ability[i] + ability[2 * N - i - 1]);
		System.out.println(ans);
	}
}
