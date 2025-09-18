import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0, hx, hy, hz;
		StringTokenizer st = new StringTokenizer(br.readLine());
		hx = Integer.parseInt(st.nextToken());
		hy = hx;
		while (--N > 0) {
			hz = Integer.parseInt(st.nextToken());
			if (hy >= hz) {
				hx = hz;
				hy = hz;
				continue;
			}
			max = Math.max(max, hz - hx);
			hy = hz;
		}
		System.out.println(max);
	}
}