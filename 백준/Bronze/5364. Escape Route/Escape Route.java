import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, ax, ay, bx = 0, by = 0, x, y;
		double dist, maxDist = Double.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		ax = Integer.parseInt(st.nextToken());
		ay = Integer.parseInt(st.nextToken());
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			dist = Math.sqrt(Math.pow(ax - x, 2) + Math.pow(ay - y, 2));
			if (dist >= maxDist)
				continue;
			maxDist = dist;
			bx = x;
			by = y;
		}
		System.out.printf("%d %d\n%d %d\n%.2f", ax, ay, bx, by, maxDist);
	}
}