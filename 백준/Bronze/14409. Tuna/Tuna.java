import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), X = Integer.parseInt(br.readLine()), ans = 0, p1, p2;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			p1 = Integer.parseInt(st.nextToken());
			p2 = Integer.parseInt(st.nextToken());
			if (Math.abs(p1 - p2) <= X)
				ans += Math.max(p1, p2);
			else
				ans += Integer.parseInt(br.readLine());
		}
		System.out.println(ans);
	}
}
