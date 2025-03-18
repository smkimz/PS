import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String a, b = "";
		int x, y = 0;
		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());
			a = st.nextToken();
			x = Integer.parseInt(st.nextToken());
			if (x < y)
				continue;
			b = a;
			y = x;
		}
		System.out.println(b);
	}
}