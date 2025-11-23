import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0, x;
		int[] R = new int[] { 1000, 1600, 1500, 170 };
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i <= 3; i++) {
				x = Integer.parseInt(st.nextToken());
				if (i == 3) {
					if (x == -1)
						break;
					x = 200 - x;
				}
				if (x >= R[i]) {
					++ans;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
