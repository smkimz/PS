import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = 0;
		double c, w, x, maxEff = 0;
		char[] name = new char[] { ' ', 'S', 'N', 'U' };
		for (int i = 1; i <= 3; i++) {
			st = new StringTokenizer(br.readLine());
			c = Double.parseDouble(st.nextToken()) * 10.0;
			w = Double.parseDouble(st.nextToken()) * 10.0;
			if (c >= 5000.0)
				c -= 500.0;
			x = w / c;
			if (x < maxEff)
				continue;
			maxEff = x;
			num = i;
		}
		System.out.println(name[num]);
	}
}