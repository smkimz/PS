import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), sum, ans = Integer.MAX_VALUE;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			for (int i = 0; i < 3; i++)
				sum += Integer.parseInt(st.nextToken());
			if (sum < 512)
				continue;
			ans = Math.min(ans, sum);
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}
}