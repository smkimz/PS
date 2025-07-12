import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y;
		int[] min = new int[2], max = new int[2];
		for (int i = 0; i < 2; i++) {
			min[i] = Integer.MAX_VALUE;
			max[i] = Integer.MIN_VALUE;
		}
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			min[0] = Math.min(min[0], x);
			max[0] = Math.max(max[0], x);
			min[1] = Math.min(min[1], y);
			max[1] = Math.max(max[1], y);
		}
		System.out.println((max[0] - min[0]) * (max[1] - min[1]));
	}
}