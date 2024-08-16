import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine()), x, y, min, max, cnt = 0;
		StringTokenizer st;
		int[] wall = new int[N + 1];
		for (int i = 1; i <= N; i++)
			wall[i] = i;
		while (--M >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			min = wall[x];
			max = wall[y];
			for (int i = x; i <= y; i++)
				wall[i] = min;
			++y;
			while (y <= N && wall[y] == max) {
				wall[y] = min;
				++y;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (wall[i] != wall[i - 1])
				++cnt;
		}
		System.out.println(cnt);
	}
}