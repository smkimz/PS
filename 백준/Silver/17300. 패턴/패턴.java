import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, x, y;
		boolean[] pathChecker = new boolean[10];
		pathChecker[0] = true;
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		pathChecker[x] = true;
		int[][] routes = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 0, 0, 2, 0, 0, 0, 4, 0, 5 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 5, 0 }, { 0, 2, 0, 0, 0, 0, 0, 5, 0, 6 }, { 0, 0, 0, 0, 0, 0, 5, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 5, 0, 0, 0, 0, 0 }, { 0, 4, 0, 5, 0, 0, 0, 0, 0, 8 },
				{ 0, 0, 5, 0, 0, 0, 0, 0, 0, 0 }, { 0, 5, 0, 6, 0, 0, 0, 8, 0, 0 }, };
		while (--N >= 0) {
			y = Integer.parseInt(st.nextToken());
			if (!pathChecker[routes[x][y]] || pathChecker[y]) {
				System.out.println("NO");
				return;
			}
			pathChecker[y] = true;
			x = y;
		}
		System.out.println("YES");
	}
}