import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n, ans = 0;
		double k, x, y, a, b, dist;
		n = Integer.parseInt(st.nextToken());
		k = Math.pow(Double.parseDouble(st.nextToken()), 2);
		x = Double.parseDouble(st.nextToken());
		y = Double.parseDouble(st.nextToken());
		while (--n >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Double.parseDouble(st.nextToken());
			b = Double.parseDouble(st.nextToken());
			dist = Math.pow(Math.abs(x - a), 2) + Math.pow(Math.abs(b - y), 2);
			if (dist > k)
				++ans;
		}
		System.out.println(ans);
	}
}
