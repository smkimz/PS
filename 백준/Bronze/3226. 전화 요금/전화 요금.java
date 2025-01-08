import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;
		int N = Integer.parseInt(br.readLine()), t, x, y, c = 0;
		while (--N >= 0) {
			st1 = new StringTokenizer(br.readLine());
			st2 = new StringTokenizer(st1.nextToken(), ":");
			t = Integer.parseInt(st1.nextToken());
			x = Integer.parseInt(st2.nextToken()) * 60 + Integer.parseInt(st2.nextToken());
			y = x + t;
			if ((x >= 1140 && y >= 1140) || x <= 420 && y <= 420)
				c += t * 5;
			else if (x <= 1140 && y >= 1140)
				c += (y - 1140) * 5 + (1140 - x) * 10;
			else if (x <= 420 && y >= 420)
				c += (420 - x) * 5 + (y - 420) * 10;
			else
				c += t * 10;
		}
		System.out.println(c);
	}
}