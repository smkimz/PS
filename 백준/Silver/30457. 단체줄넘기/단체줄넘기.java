import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, x, y;
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[][] heights = new boolean[2][1001];
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		x = Integer.parseInt(st.nextToken());
		heights[0][x] = true;
		++ans;
		--N;
		while (--N >= 0) {
			y = Integer.parseInt(st.nextToken());
			if (!heights[0][y]) {
				++ans;
				heights[0][y] = true;
			} else
				dq.add(y);
			x = y;
		}
		if (!dq.isEmpty()) {
			x = dq.poll();
			heights[1][x] = true;
			++ans;
		}
		while (!dq.isEmpty()) {
			y = dq.poll();
			if (!heights[1][y]) {
				++ans;
				heights[1][y] = true;
			}
			x = y;
		}
		System.out.println(ans);
	}
}