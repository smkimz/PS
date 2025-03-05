import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, M, x, y, nx = -1, ny = -1, num = -1, dist, maxDist, score = 0;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		ArrayList<Point> targets = new ArrayList<>();
		boolean[] isRemoved = new boolean[N + M];
		Point p;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			targets.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		x = 0;
		y = 0;
		while (--M >= 0) {
			maxDist = 0;
			for (int i = 0; i < targets.size(); i++) {
				if (isRemoved[i])
					continue;
				p = targets.get(i);
				dist = (int) (Math.pow(Math.abs(p.x - x), 2) + Math.pow(Math.abs(p.y - y), 2));
				if (dist > maxDist) {
					num = i;
					maxDist = dist;
					nx = p.x;
					ny = p.y;
				}
			}
			score += maxDist;
			isRemoved[num] = true;
			x = nx;
			y = ny;
			st = new StringTokenizer(br.readLine());
			targets.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		System.out.println(score);
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}