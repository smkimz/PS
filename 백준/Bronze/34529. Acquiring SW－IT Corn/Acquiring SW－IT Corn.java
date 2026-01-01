import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
		int a, b, ans = 0;
		int[] g = new int[] { 100, 50, 20 };
		for (int i = 0; i < 3; i++) {
			a = Integer.parseInt(st1.nextToken());
			b = Integer.parseInt(st2.nextToken());
			ans += b / g[i] * a;
		}
		System.out.println(ans);
	}
}
