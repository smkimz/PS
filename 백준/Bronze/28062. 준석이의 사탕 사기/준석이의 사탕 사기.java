import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a, r, oddMin = 1001, oddCnt = 0;
		int[] sum = new int[2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			a = Integer.parseInt(st.nextToken());
			r = a % 2;
			sum[r] += a;
			if (r == 0)
				continue;
			oddMin = Math.min(oddMin, a);
			++oddCnt;
		}
		if (oddCnt % 2 == 1)
			sum[1] -= oddMin;
		System.out.println(sum[0] + sum[1]);
	}
}