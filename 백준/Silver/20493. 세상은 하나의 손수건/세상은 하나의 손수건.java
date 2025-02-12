import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken()), ta, tb = 0, x = 0, y = 0,
				dir = 0;
		char s;
		int[][] dt = new int[][] { { 1, 0, -1, 0 }, { 0, -1, 0, 1 } };
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			ta = Integer.parseInt(st.nextToken());
			s = st.nextToken().charAt(0);
			x += dt[0][dir] * (ta - tb);
			y += dt[1][dir] * (ta - tb);
			tb = ta;
			if (s == 'r')
				dir = (dir + 1) % 4;
			else
				dir = (dir + 3) % 4;
		}
		x += dt[0][dir] * (T - tb);
		y += dt[1][dir] * (T - tb);
		System.out.printf("%d %d", x, y);
	}
}