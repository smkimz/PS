import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, a, b;
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		boolean isDownhill = false;
		while (--N >= 0) {
			b = Integer.parseInt(st.nextToken());
			if ((isDownhill && a < b) || a == b) {
				System.out.println("NO");
				return;
			} else if (a > b)
				isDownhill = !isDownhill ? true : false;
			a = b;
		}
		System.out.println("YES");
	}
}