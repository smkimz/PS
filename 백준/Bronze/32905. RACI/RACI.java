import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), x;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = 0;
			for (int i = 0; i < M; i++)
				x += st.nextToken().charAt(0) == 'A' ? 1 : 0;
			if (x != 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}