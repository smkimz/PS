import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a, asum = 0, bsum = 0;
		StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			a = Integer.parseInt(st1.nextToken());
			asum += a;
			if (st2.nextToken().charAt(0) == '0')
				bsum += a;
		}
		System.out.printf("%d\n%d", asum, bsum);
	}
}