import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()),
				k = Integer.parseInt(st.nextToken());
		if ((d > 0 && a > k) || (d < 0 && a < k) || (k - a) % d != 0)
			System.out.println('X');
		else
			System.out.println((k - a) / d + 1);
	}
}