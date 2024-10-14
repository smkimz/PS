import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] weights = { 100, 50, 20, 10, 5, 2, 1 };
		int N = Integer.parseInt(br.readLine()) - 2, weight, ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		weight = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			if (weight > 0)
				weight -= Integer.parseInt(st.nextToken());
			else
				weight += Integer.parseInt(st.nextToken());
		}
		weight = Math.abs(weight);
		for (int i = 0; i <= 6; i++) {
			ans += weight / weights[i];
			weight %= weights[i];
		}
		System.out.println(ans);
	}
}