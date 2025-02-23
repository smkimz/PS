import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M, ans = 0;
		long sx, sy, ax, ay, bx, by, ex, ey, dist, minDist = Long.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		sx = Long.parseLong(st.nextToken());
		sy = Long.parseLong(st.nextToken());
		ex = Long.parseLong(st.nextToken());
		ey = Long.parseLong(st.nextToken());
		for (int i = 1; i <= N; i++) {
			M = Integer.parseInt(br.readLine());
			dist = 0;
			ax = sx;
			ay = sy;
			while (--M >= 0) {
				st = new StringTokenizer(br.readLine());
				bx = Long.parseLong(st.nextToken());
				by = Long.parseLong(st.nextToken());
				dist += Math.abs(ax - bx) + Math.abs(ay - by);
				ax = bx;
				ay = by;
			}
			dist += Math.abs(ax - ex) + Math.abs(ay - ey);
			if (dist >= minDist)
				continue;
			minDist = dist;
			ans = i;
		}
		System.out.print(ans);
	}
}