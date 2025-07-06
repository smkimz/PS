import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1, len = 0, fx, fy, px, py, x, y;
		StringTokenizer st = new StringTokenizer(br.readLine());
		fx = Integer.parseInt(st.nextToken());
		fy = Integer.parseInt(st.nextToken());
		px = fx;
		py = fy;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			len += Math.abs(x - px) + Math.abs(y - py);
			px = x;
			py = y;
		}
		len += Math.abs(fx - px) + Math.abs(fy - py);
		System.out.println(len);
	}
}